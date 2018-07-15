package pl.sda.service;

import pl.sda.model.Vehicle;

import java.util.List;

public interface CarDataService {
    List<Vehicle> loadCarsThatCanBeSold();
    Vehicle addCars(Vehicle newCarToBeSaved);


    Vehicle getById(Long id);

}
