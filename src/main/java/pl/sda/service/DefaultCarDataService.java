package pl.sda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.model.Vehicle;
import pl.sda.repository.VehicleFinder;
import pl.sda.repository.VehicleRepository;

import java.util.List;
@Service
public abstract class DefaultCarDataService implements CarDataService {


    private final VehicleRepository vehicleRepository;


    @Autowired
    public DefaultCarDataService(VehicleRepository vehicleRepository, VehicleFinder vehicleFinder) {
        this.vehicleRepository = vehicleRepository;

    }
    abstract List<Vehicle> getAvailable();


    public List<Vehicle> loadCarsThatCanBeSold() {
        return getAvailable();
    }

    @Override
    public Vehicle addVehicle(Vehicle newVehicleToBeSaved) {
        return vehicleRepository.save(newVehicleToBeSaved);
    }

    @Override
    public Vehicle getVehicleById(Long vehicleId) {
        return vehicleRepository.findOne(vehicleId);
    }
}
