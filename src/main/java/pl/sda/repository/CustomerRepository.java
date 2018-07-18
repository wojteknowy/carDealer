package pl.sda.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
