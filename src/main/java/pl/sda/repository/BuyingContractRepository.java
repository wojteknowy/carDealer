package pl.sda.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.model.BuyingContract;

public interface BuyingContractRepository extends CrudRepository <BuyingContract, Long> {
}
