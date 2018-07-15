package pl.sda.service;

import pl.sda.model.Vehicle;
import pl.sda.repository.CarsFinder;
import pl.sda.repository.CarsRepository;

import java.util.List;

public class DefaultCarDataService implements CarDataService{

    private final CarsRepository carsRepository;
    private final CarsFinder carsFinder;

    public DefaultCarDataService(CarsRepository carsRepository, CarsFinder carsFinder) {
        this.carsRepository = carsRepository;
        this.carsFinder = carsFinder;
    }

    public List<Vehicle> loadCarsThatCanBeSold() {
        return carsFinder.getAvailable();
    }

    @Override
    public Vehicle addCars(Vehicle newCarToBeSaved) {
        return carsRepository.save(newCarToBeSaved);
    }

    @Override
    public Vehicle getById(Long id) {
        return carsRepository.findOne(id);
    }
}
