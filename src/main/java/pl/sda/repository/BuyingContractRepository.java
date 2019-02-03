package pl.sda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.model.BuyingContract;
@Repository
public interface BuyingContractRepository extends CrudRepository<BuyingContract, Long>{}
