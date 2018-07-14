package repository;

import model.Cars;
import org.springframework.data.repository.CrudRepository;

public interface CarsRepository extends CrudRepository <Cars, Long> {
}
