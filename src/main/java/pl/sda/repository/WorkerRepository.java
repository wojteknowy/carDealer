package pl.sda.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.model.Worker;

public interface WorkerRepository extends CrudRepository<Worker , Long> {
}
