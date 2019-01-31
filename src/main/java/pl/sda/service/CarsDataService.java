package pl.sda.service;

import pl.sda.repository.PurchaseRepository;
import pl.sda.repository.VehicleRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarsDataService {
    private final VehicleRepository vehicleRepository;
    private final PurchaseRepository purchaseRepository;
    private final SellingContractsRepository sellingContractsRepository;


    public CarsDataService(CarsRepository carsRepository,
                           BuyingContractsRepository buyingContractsRepository,
                           SellingContractsRepository sellingContractsRepository) {

        this.carsRepository = carsRepository;
        this.buyingContractsRepository = buyingContractsRepository;
        this.sellingContractsRepository = sellingContractsRepository;

    }

    public List<DtoShowCar> showCars() throws NullPointerException {
        List<Cars> cars = (List<Cars>) carsRepository.findAll();
        List<BuyingContracts> buyingContracts = (List<BuyingContracts>) buyingContractsRepository.findAll();
        List<SellingContracts> sellingContracts = (List<SellingContracts>) sellingContractsRepository.findAll();
        List<DtoShowCar> list = new ArrayList<>();

        for (Cars c : cars) {

            DtoShowCar dtoShowCar = new DtoShowCar();
            dtoShowCar.setId(c.getId());
            dtoShowCar.setCarManufacturer(c.getManufacturer());
            dtoShowCar.setCarModel(c.getModel());
            dtoShowCar.setCarYearProduction(c.getYearProduction());
            dtoShowCar.setCarMilage(c.getMilage());
            dtoShowCar.setCarNrChassis(c.getNrChassis());
            dtoShowCar.setCarPrice(c.getPrice());
            dtoShowCar.setCarVisibility(c.isVisibility());

            for (BuyingContracts bc : buyingContracts) {
                if (c.getId().equals((bc.getDate()))) {
                    dtoShowCar.setPurchaseDate(bc.getDate());
                    break;
                }
            }

            for (SellingContracts sc : sellingContracts) {
                if (c.getId().equals(sc.getCars().getId())) {
                    dtoShowCar.setSaleDate(sc.getDate());
                    break;
                }
            }
            list.add(dtoShowCar);
        }
        return list;
    }

    public List<DtoShowCar> showAvailableCars() throws NullPointerException {
        List<DtoShowCar> list = showCars();
        List<SellingContracts> sellingContracts = (List<SellingContracts>) sellingContractsRepository.findAll();

        for (SellingContracts sc : sellingContracts) {
            for (DtoShowCar dtoShowCar : list) {
                if ((sc.getCars().getId().equals(dtoShowCar.getId()))) {
                    list.remove(dtoShowCar);
                    break;
                }
            }
        }
        return list;
    }

    public List<DtoShowCar> showAvailableCars2(List<DtoShowCar> listIn) {
        List<DtoShowCar> listOut = new ArrayList<>();
        for (DtoShowCar dtoShowCar : listIn) {
            if (dtoShowCar.isCarVisibility()) {
                listOut.add(dtoShowCar);
            }
        }
        return listOut;
    }

    public List<DtoShowCar> showSoldCars() {
        List<DtoShowCar> listIn = showCars();
        List<DtoShowCar> listOut = new ArrayList<>();
        List<SellingContracts> sellingContracts = (List<SellingContracts>) sellingContractsRepository.findAll();

        for (SellingContracts sc : sellingContracts) {
            for (DtoShowCar dtoShowCar : listIn) {
                if ((sc.getCars().getId().equals(dtoShowCar.getId()))) {
                    listOut.add(dtoShowCar);
                    break;
                }
            }
        }
        return listOut;
    }

    public List<DtoShowCar> showBoughtCars() {

        List<DtoShowCar> list = showCars();
        List<BuyingContracts> buyingContracts = (List<BuyingContracts>) buyingContractsRepository.findAll();

        for (BuyingContracts bc : buyingContracts) {
            for (DtoShowCar dtoShowCar : list) {
                if (bc.getCars().getId().equals(dtoShowCar.getId())) {
                    dtoShowCar.setCarPrice(bc.getPrice());

                    Date date = bc.getDate();

                    dtoShowCar.setPurchaseDate(date);
                    break;
                }
            }
        }
        return list;
    }

}
