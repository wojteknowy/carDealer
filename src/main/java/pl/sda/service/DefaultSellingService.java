package pl.sda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.model.Customer;
import pl.sda.model.Purchase;
import pl.sda.model.Vehicle;
import pl.sda.repository.CustomerRepository;
import pl.sda.repository.PurchaseRepository;
import pl.sda.repository.VehicleRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DefaultSellingService implements SellingService {

    private VehicleRepository vehicleRepository;
    private CustomerRepository customerRepository;
    private PurchaseRepository purchaseRepository;
    @Autowired
    public DefaultSellingService(
            VehicleRepository vehicleRepository,
            CustomerRepository customerRepository,
            PurchaseRepository purchaseRepository) {
        this.vehicleRepository = vehicleRepository;
        this.customerRepository = customerRepository;
        this.purchaseRepository = purchaseRepository;
    }

    @Transactional
    public Purchase sell(Long vehicleId, final Customer customer, Long price) {
      // Optional<Vehicle> notSoldVehicle =
      //         vehicleRepository.findNotSoldVehicle(vehicleId);
      // Purchase purchase = notSoldVehicle
      //         .map(vehicle -> performSell(vehicle, customer, price))
      //         .orElse(null);
     //  return purchase;
      // return vehicleRepository.findNotSoldVehicle(vehicleId)
      //         .map(vehicle -> performSell(vehicle, customer, price))
      //         .orElse(null);
        return null;
    }

    @Override
    public List<Purchase> loadHistory(String documentNo) {
        return purchaseRepository.findByCustomerDocumentNo(documentNo);
    }

    @Override
    public Purchase loadPurchaseById(Long purchaseId) {
        return purchaseRepository.findOne(purchaseId);
    }

    private Purchase performSell(Vehicle veh, Customer customer, Long price) {
        veh.setSold(true);
        vehicleRepository.save(veh);
        // z repozytorium spróbuj pobrać klienta po jego numerze dokumentu
        Customer persistedCustomer = customerRepository
                .findByDocumentNo(customer.getDocumentNo())
                // a jeżeli nie było klienta z takim numerem dokumentu w bazie
                // to użyj danych klienta, które dopiero co otrzymaliśmy
                .orElseGet(() -> customerRepository.save(customer));
        Purchase purchase = new Purchase();
        purchase.setVehicle(veh);
        purchase.setCustomer(persistedCustomer);
        purchase.setDate(new Date());
        purchase.setPrice(price);
        return purchaseRepository.save(purchase);
    }

}



