package pl.sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.repository.CustomerRepository;
import pl.sda.repository.SellingRepository;
import pl.sda.repository.VehicleRepository;

@Controller
@RequestMapping("/sell")
public class SellingDataController {

  //  private final SellingRepository sellingRepository;
  //  private final VehicleRepository vehicleRepository;
  //  private final CustomerRepository customerRepository;
//
  //  @Autowired
  //  public SellingDataController(SellingRepository sellingRepository,
  //                               VehicleRepository vehicleRepository,
  //                               CustomerRepository customerRepository) {
  //      this.sellingRepository = sellingRepository;
  //      this.vehicleRepository = vehicleRepository;
  //      this.customerRepository = customerRepository;
  //  }


}
