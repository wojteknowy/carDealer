package pl.sda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.model.Vehicle;
import pl.sda.repository.VehicleRepository;

import java.util.List;
@Service
public class DefaultCarDataService implements CarDataService{

    private final VehicleRepository vehicleRepository;


    @Autowired
    public DefaultCarDataService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;

    }

    @Override
    public List<Vehicle> loadCarsThatCanBeSold() {
        return (List<Vehicle>) vehicleRepository.findAll();
    }

    @Override
    public Vehicle addVehicle(Vehicle newCarToBeSaved) {
        return vehicleRepository.save(newCarToBeSaved);
    }


}
