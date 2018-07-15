package pl.sda.repository;

import pl.sda.model.Vehicle;

import java.util.List;

public interface CarsFinder {
    List<Vehicle> getAll();
    List<Vehicle> getAvailable();
}
