package pl.sda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.model.Worker;
@Repository
public interface WorkerRepository extends CrudRepository<Worker , Long> {
}
