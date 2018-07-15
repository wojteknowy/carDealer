package pl.sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.model.BuyingContract;
import pl.sda.model.DtoByVehicle;
import pl.sda.model.Vehicle;
import pl.sda.repository.BuyingContractRepository;
import pl.sda.repository.VehicleRepository;
import pl.sda.service.CarDataService;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarDataController {

    private final VehicleRepository vehicleRepository;
    private final CarDataService carDataService;
    private final BuyingContractRepository buyingContractRepository;
    @Autowired
    public CarDataController(VehicleRepository vehicleRepository,
                             CarDataService carDataService,
                             BuyingContractRepository buyingContractRepository) {
        this.vehicleRepository = vehicleRepository;
        this.carDataService = carDataService;
        this.buyingContractRepository = buyingContractRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printAvilableCars(Model model) {
        List<Vehicle> vehicles = (List<Vehicle>) vehicleRepository.findAll();
        if (vehicles != null) {
            model.addAttribute("vehicles1", vehicles);
        }
        return "vehicleList";
    }

    @GetMapping("/new")
    public String addVehicleFrom(Model model) {
        model.addAttribute("addedVehicle", new DtoByVehicle());
        return "addVehicle";
    }

    @PostMapping
    public String saveVehicle(
            @ModelAttribute("addedVehicle") DtoByVehicle dtoByVehicle) {

        Vehicle vehicle = new Vehicle();
        BuyingContract buyingContract = new BuyingContract();

        vehicle.setNrVin(dtoByVehicle.getVehicleNrVin());
        vehicle.setYear(dtoByVehicle.getVehicleYear());
        vehicle.setManufacturer(dtoByVehicle.getVehicleManufacturer());
        vehicle.setModel(dtoByVehicle.getVehicleModel());
        vehicle.setNrOc(dtoByVehicle.getVehicleNrOc());
        vehicle.setNrRegistrationCar(dtoByVehicle.getVehicleNrRegistrationCar());
        vehicle.setFuel(dtoByVehicle.getVehicleFuel());
        vehicle.setMileage(dtoByVehicle.getVehicleMileage());
        vehicle.setEngine(dtoByVehicle.getVehicleEngine());
        vehicle.setPower(dtoByVehicle.getVehiclePower());
        vehicle.setTransmission(dtoByVehicle.getVehicleTransmission());
        vehicle.setInfo(dtoByVehicle.getVehicleInfo());


        buyingContract.setDate(new Date());
        buyingContract.setPrice(dtoByVehicle.getBuyPrice());

        vehicleRepository.save(vehicle);
        buyingContractRepository.save(buyingContract);
        return "redirect:/cars";
    }


    @RequestMapping("/{carId}/desc")
    public String getCarDescription(
            @PathVariable("carId") Long carId, Model model) {
        Vehicle vehicle = vehicleRepository.findOne(carId);
        String description = vehicle.getInfo();
        model.addAttribute("carDesc", description);
        return "info";
    }


}
