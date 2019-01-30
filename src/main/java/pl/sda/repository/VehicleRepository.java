package pl.sda.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.sda.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface VehicleRepository extends CrudRepository <Vehicle, Long> {

  //     @Query("SELECT v FROM Vehicle v WHERE v.id = :vehId AND v.Sold = false")
  //     Optional<Vehicle> findNotSoldVehicle(@Param("vehId") Long id);
}
