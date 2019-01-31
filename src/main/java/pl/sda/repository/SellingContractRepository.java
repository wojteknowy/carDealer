package pl.sda.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.model.SellingContracts;

public interface SellingContractRepository extends CrudRepository<SellingContracts, Long> {
}
