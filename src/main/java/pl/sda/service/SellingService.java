package pl.sda.service;

import org.springframework.stereotype.Service;
import pl.sda.model.Customer;
import pl.sda.model.Purchase;

import java.util.List;
@Service
public interface SellingService {
    Purchase sell(Long vehicleId, Customer customer, Long price);
    List<Purchase> loadHistory(String documentNo);
    Purchase loadPurchaseById(Long purchaseId);
}
