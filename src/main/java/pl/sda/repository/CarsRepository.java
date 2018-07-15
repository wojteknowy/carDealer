package pl.sda.repository;

import pl.sda.model.Vehicle;
import org.springframework.data.repository.CrudRepository;


public interface CarsRepository extends CrudRepository <Vehicle, Long> {
}
