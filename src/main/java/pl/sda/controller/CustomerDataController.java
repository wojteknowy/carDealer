package pl.sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.model.Customer;
import pl.sda.repository.CustomerRepository;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerDataController {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerDataController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printCustomer(Model model) {
        List<Customer> customers = (List<Customer>) customerRepository.findAll();
        if (customers != null) {
            model.addAttribute("customers", customers);
        }
        return "customersList";
    }

    @GetMapping("/new")
    public String addCustomer(Model model) {
        model.addAttribute("addCustomer", new Customer());
        return "addCustomer";
    }

    @PostMapping
    public String saveNewCustomer(
            @ModelAttribute("addCustomer") Customer customer) {
        customer.getLastname();
        customer.getName();
        customer.getAdress();
        customer.getNip();
        customer.getPesel();
        customerRepository.save(customer);
        return "redirect/customer";
    }
}
