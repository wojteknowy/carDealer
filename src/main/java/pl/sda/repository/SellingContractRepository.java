package pl.sda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.model.SellingContracts;
@Repository
public interface SellingContractRepository extends CrudRepository<SellingContracts, Long>  {
}
