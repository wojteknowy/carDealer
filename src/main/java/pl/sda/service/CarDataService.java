package pl.sda.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.sda.model.Vehicle;

import java.util.List;
@Component
public interface CarDataService {
    List<Vehicle> loadCarsThatCanBeSold();
    Vehicle addVehicle(Vehicle newCarToBeSaved);
    Vehicle getVehicleById(Long vehicleId);




}
