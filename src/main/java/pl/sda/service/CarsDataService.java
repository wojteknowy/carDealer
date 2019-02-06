package pl.sda.service;

import org.springframework.stereotype.Service;
import pl.sda.model.BuyingContract;
import pl.sda.model.DtoSoldVehicles;
import pl.sda.model.SellingContracts;
import pl.sda.model.Vehicle;
import pl.sda.repository.BuyingContractRepository;
import pl.sda.repository.SellingContractRepository;
import pl.sda.repository.VehicleRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CarsDataService {
    private final VehicleRepository vehicleRepository;
    private final BuyingContractRepository buyingContractRepository;
    private final SellingContractRepository sellingContractRepository;

    public CarsDataService(VehicleRepository vehicleRepository, BuyingContractRepository buyingContractRepository,
                           SellingContractRepository sellingContractRepository) {
        this.vehicleRepository = vehicleRepository;
        this.buyingContractRepository = buyingContractRepository;
        this.sellingContractRepository = sellingContractRepository;
    }


    public List<DtoSoldVehicles> showVehicles() throws NullPointerException {
        List<Vehicle> vehicle = (List<Vehicle>) vehicleRepository.findAll();
        List<BuyingContract> buyingContracts = (List<BuyingContract>) buyingContractRepository.findAll();
        List<SellingContracts> sellingContracts = (List<SellingContracts>) sellingContractRepository.findAll();
        List<DtoSoldVehicles> list = new ArrayList<>();

        for (Vehicle v : vehicle) {

            DtoSoldVehicles dtoSoldVehicles = new DtoSoldVehicles();
            dtoSoldVehicles.setId(v.getId());
            dtoSoldVehicles.setManufacturer(v.getManufacturer());
            dtoSoldVehicles.setModel(v.getModel());
            dtoSoldVehicles.setEngine(v.getEngine());
            dtoSoldVehicles.setPrice(v.getPrice());
            dtoSoldVehicles.setMileage(v.getMileage());
            dtoSoldVehicles.setSold(v.getSold());
        }
        return list;
    }

    public List<DtoSoldVehicles> showAvailableVehicles() throws NullPointerException {
        List<DtoSoldVehicles> listVehicles = showVehicles();
        List<SellingContracts> sellingContracts = (List<SellingContracts>) sellingContractRepository.findAll();

        for (SellingContracts sc : sellingContracts) {
            for (DtoSoldVehicles dtoShowVehicle : listVehicles) {
                if (sc.getVehicle().getId().equals(dtoShowVehicle.getId())) {
                    listVehicles.remove(dtoShowVehicle);
                    break;
                }
            }
        }
        return listVehicles;
    }


    public List<DtoSoldVehicles> showAvailableCars2(List<DtoSoldVehicles> listIn) {
        List<DtoSoldVehicles> listOut = new ArrayList<>();
        for (DtoSoldVehicles dtoShowVehicles : listIn) {
            if (dtoShowVehicles.setSold(true)) ;
            listOut.add(dtoShowVehicles);
        }
        return listOut;
    }

    public List<DtoSoldVehicles> showSoldVehicles() {
        List<DtoSoldVehicles> listIn = showVehicles();
        List<DtoSoldVehicles> listOut = new ArrayList<>();
        List<SellingContracts> sellingContracts = (List<SellingContracts>) sellingContractRepository.findAll();


        for (SellingContracts sc : sellingContracts) {
            for (DtoSoldVehicles dtoShowVehicles : listIn) {
                if ((sc.getVehicle().getId().equals(dtoShowVehicles.getId()))) {
                    listOut.add(dtoShowVehicles);
                    break;
                }
            }
        }
        return listOut;
    }


    public List<DtoSoldVehicles> showBoughtVehicles() {

        List<DtoSoldVehicles> list = showVehicles();
        List<BuyingContract> buyingContracts = (List<BuyingContract>)  buyingContractRepository.findAll();

        for (BuyingContract bc : buyingContracts) {
            for (DtoSoldVehicles dtoSoldVehicles : list) {
                if (bc.getVehicle().getId().equals(dtoSoldVehicles.getId())) {
                    dtoSoldVehicles.setPrice(bc.getPrice());

                    Date date = bc.getDate();

                    dtoSoldVehicles.setPurchaseDate(date);
                    break;
                }
            }
        }
        return list;
    }


}
