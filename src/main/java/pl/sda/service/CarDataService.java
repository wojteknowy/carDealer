package pl.sda.service;

import org.springframework.stereotype.Service;
import pl.sda.model.Vehicle;

import java.util.List;
@Service
public interface CarDataService  {
    List<Vehicle> loadCarsThatCanBeSold();
    Vehicle addVehicle(Vehicle newCarToBeSaved);
    Vehicle getVehicleById(Long vehicleId);




}
