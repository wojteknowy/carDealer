package pl.sda.repository;

import pl.sda.model.Vehicle;

import java.util.List;

public interface VehicleFinder {
    List<Vehicle> getAvailable();

}
