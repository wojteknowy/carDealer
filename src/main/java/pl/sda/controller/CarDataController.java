package pl.sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.model.Vehicle;
import org.springframework.stereotype.Controller;
import pl.sda.repository.VehicleRepository;
import pl.sda.service.CarDataService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarDataController {

  private final VehicleRepository vehicleRepository;
  private final CarDataService carDataService;
@Autowired
  public CarDataController(VehicleRepository vehicleRepository, CarDataService carDataService) {
    this.vehicleRepository = vehicleRepository;
    this.carDataService = carDataService;
  }

  @RequestMapping(method =  RequestMethod.GET)
  public String getCar(Model model){
    List<Vehicle> vehicles = (List<Vehicle>) vehicleRepository.findAll();
    if (vehicles !=null){
      model.addAttribute("vehicles1", vehicles);
    }

    return "vehicleList";
  }

  @GetMapping("/new")
  public String addCarForm(Model model) {
    model.addAttribute("addedVehicle", new Vehicle());
    return "addVehicle";
  }
  @PostMapping
  public String saveVehicle(
          @ModelAttribute("addedVehicle") Vehicle vehicleToBeSaved) {
    carDataService.addVehicle(vehicleToBeSaved);
    return "redirect:/vehicles";
  }







}
