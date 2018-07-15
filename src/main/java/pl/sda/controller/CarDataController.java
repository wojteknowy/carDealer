package pl.sda.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.sda.model.Vehicle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.repository.CarsRepository;

import java.util.List;
import java.util.Scanner;

@Controller
@RequestMapping("/cars")
public class CarDataController {

  private final CarsRepository carsRepository;

  public CarDataController(CarsRepository carsRepository) {
    this.carsRepository = carsRepository;
  }

  @RequestMapping(method =  RequestMethod.GET)
  public String getCar(Model model){
    List<Vehicle> vehicles = (List<Vehicle>)carsRepository.findAll();
    if (vehicles !=null){
      model.addAttribute("vehicles1", vehicles);
    }

    return "vehicleList";
  }






}
