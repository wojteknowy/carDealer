package service;

import model.Cars;

import java.util.List;

public interface CarDataService {
    List<Cars> loadCarsThatCanBeSold();
    Cars addVehicle(Cars newVehicleToBeSaved);


    Cars getById(Long id);

}
