package pl.sda.service;

import pl.sda.model.BuyingContract;
import pl.sda.model.SellingContracts;
import pl.sda.model.SoldVehicles;
import pl.sda.model.Vehicle;
import pl.sda.repository.BuyingContractRepository;
import pl.sda.repository.SellingContractRepository;
import pl.sda.repository.VehicleRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


    public List<SoldVehicles> showCars() throws NullPointerException {
        List<Vehicle> vehicle = (List<Vehicle>) vehicleRepository.findAll();
        List<BuyingContract> buyingContracts = (List<BuyingContract>) buyingContractRepository.findAll();
        List<SellingContracts> sellingContracts = (List<SellingContracts>) sellingContractRepository.findAll();
        List<SoldVehicles> list = new ArrayList<>();

        for (Vehicle v : vehicle) {

            SoldVehicles soldVehicles = new SoldVehicles();
            soldVehicles.setId(v.getId());
            soldVehicles.setManufacturer(v.getManufacturer());
            soldVehicles.setModel(v.getModel());
            soldVehicles.setEngine(v.getEngine());
            soldVehicles.setPrice(v.getPrice());
            soldVehicles.setMileage(v.getMileage());
            soldVehicles.setSold(v.getSold());


         //   public List<SoldVehicles> showAvailableCars () throws NullPointerException {
         //       List<SoldVehicles> listVehicles = showCars();
         //       List<SellingContracts> sellingContracts = (List<SellingContracts>) sellingContractRepository.findAll();
//
         //       for (SellingContracts sc : sellingContracts) {
         //           for (DtoShowCar dtoShowCar : list) {
         //               if ((sc.getCars().getId().equals(dtoShowCar.getId()))) {
         //                   list.remove(dtoShowCar);
         //                   break;
         //               }
         //           }
         //       }
         //       return list;
         //   }
//
         //   public List<DtoShowCar> showAvailableCars2 (List < DtoShowCar > listIn) {
         //       List<DtoShowCar> listOut = new ArrayList<>();
         //       for (DtoShowCar dtoShowCar : listIn) {
         //           if (dtoShowCar.isCarVisibility()) {
         //               listOut.add(dtoShowCar);
         //           }
         //       }
         //       return listOut;
         //   }
//
         //   public List<DtoShowCar> showSoldCars () {
         //       List<DtoShowCar> listIn = showCars();
         //       List<DtoShowCar> listOut = new ArrayList<>();
         //       List<SellingContracts> sellingContracts = (List<SellingContracts>) sellingContractsRepository.findAll();
//
         //       for (SellingContracts sc : sellingContracts) {
         //           for (DtoShowCar dtoShowCar : listIn) {
         //               if ((sc.getCars().getId().equals(dtoShowCar.getId()))) {
         //                   listOut.add(dtoShowCar);
         //                   break;
         //               }
         //           }
         //       }
         //       return listOut;
         //   }
//
         //   public List<DtoShowCar> showBoughtCars () {
//
         //       List<DtoShowCar> list = showCars();
         //       List<BuyingContracts> buyingContracts = (List<BuyingContracts>) buyingContractsRepository.findAll();
//
         //       for (BuyingContracts bc : buyingContracts) {
         //           for (DtoShowCar dtoShowCar : list) {
         //               if (bc.getCars().getId().equals(dtoShowCar.getId())) {
         //                   dtoShowCar.setCarPrice(bc.getPrice());
//
         //                   Date date = bc.getDate();
//
         //                   dtoShowCar.setPurchaseDate(date);
         //                   break;
         //               }
         //           }
         //       }
         //       return list;
         //   }

       }return list;
    }
}
