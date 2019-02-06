package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sda.repository.BuyingContractRepository;
import pl.sda.repository.SellingContractRepository;
import pl.sda.repository.VehicleRepository;
import pl.sda.service.CarsDataService;
import pl.sda.service.DefaultCarDataService;

import java.util.Scanner;

@Controller
@RequestMapping("/vehicles")
public class CarDataController {


    private CarsDataService carsDataService;
    private final VehicleRepository vehicleRepository;
    private final DefaultCarDataService defaultCarDataService;
    private final BuyingContractRepository buyingContractRepository;
    private final SellingContractRepository sellingContractRepository;

    public CarDataController(CarsDataService carsDataService, VehicleRepository vehicleRepository, DefaultCarDataService defaultCarDataService, BuyingContractRepository buyingContractRepository, SellingContractRepository sellingContractRepository) {
        this.carsDataService = carsDataService;
        this.vehicleRepository = vehicleRepository;
        this.defaultCarDataService = defaultCarDataService;
        this.buyingContractRepository = buyingContractRepository;
        this.sellingContractRepository = sellingContractRepository;
    }

//   @RequestMapping("/{vehicleId}")
//   public String getCar(
//           @PathVariable("vehicleId") Long vehicleId,
//           Model model) {
//       Vehicle vehicle = defaultCarDataService.getVehicleById(vehicleId);
//       if (vehicle != null) {
//           model.addAttribute("vehicle", vehicle);
//       }
//       return "vehicleDetails";
//   }

//    @RequestMapping(method = RequestMethod.GET)
//    public String printAvailableCars(Model model) {
//        List<Vehicle> vehicles = defaultCarDataService.loadCarsThatCanBeSold();
//        model.addAttribute("vehicleList", vehicles);
//      return "vehicleList";
// }

//   @GetMapping("/new")
//   public String addCarForm(Model model) {
//       model.addAttribute("addedVehicle", new Vehicle());
//       return "addVehicle";
//   }

//   @PostMapping
//   public String saveVehicle(
//           @ModelAttribute("addedVehicle") Vehicle vehicleToBeSaved) {
//       carDataService.addVehicle(vehicleToBeSaved);
//       return "redirect:/vehicles";
//   }

//   @GetMapping("/{vehicleId}/sell")
//   public String sellVehicleForm(
//           @PathVariable("vehicleId") Long vehicleId,
//           Model model) {
//       model.addAttribute("vehicleId", vehicleId);
//       model.addAttribute("sellData", new PurchaseFormData());
//       return "sellVehicle";
//   }

//    public void createCar() {
//        Vehicle vehicle = new Vehicle();
//        System.out.println("Provide vehicle data:");
//        System.out.print("   Manufacturer: ");
//        vehicle.setManufacturer(readStringInput());
//        System.out.print("   Model: ");
//        vehicle.setModel(readStringInput());
//        System.out.print("   Production Year: ");
//        vehicle.setYear(readStringInput());
//        System.out.print("   Mileage: ");
//        vehicle.setMileage(readStringInput());
//        System.out.print("   Fuel: ");
//        vehicle.setFuel(readStringInput());
//        System.out.print("   Price: ");
//        vehicle.setPrice(readLongInput());
//        vehicle.setSold(false);
//
//        carDataService.addVehicle(vehicle);
//    }

    private String readStringInput() {
        return new Scanner(System.in).nextLine();
    }

    private Long readLongInput() {
        return Long.parseLong(new Scanner(System.in).nextLine());
    }


}

