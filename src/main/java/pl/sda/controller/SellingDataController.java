package pl.sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.sda.model.Customer;
import pl.sda.model.Purchase;
import pl.sda.model.PurchaseFormData;
import pl.sda.service.SellingService;

import javax.validation.Valid;
import java.util.List;
import java.util.Scanner;

@Controller
@RequestMapping("/sell")
public class SellingDataController {
    private final SellingService sellingService;
    @Autowired
    public SellingDataController(SellingService sellingService) {
        this.sellingService = sellingService;
    }

    @GetMapping("/{id}")
    public String getPurchase(
            @PathVariable("id") Long purchaseId,
            Model model) {
        Purchase purchase = sellingService.loadPurchaseById(purchaseId);
        if (purchase != null) {
            model.addAttribute("p", purchase);
        }
        return "purchaseDetails";
    }

    @PostMapping
    @RequestMapping(method = RequestMethod.GET)
    public String sold(
            @Valid @ModelAttribute("sellData") PurchaseFormData purchaseData,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // jeżeli wystąpił jakikolwiek błąd
            return "sellVehicle";
        }
        Customer customer = new Customer();
        customer.setName(purchaseData.getName());
        customer.setLastname(purchaseData.getLastname());
        customer.setDocumentNo(purchaseData.getDocumentNo());
        customer.setPesel(purchaseData.getPesel());
        sellingService.sell(
                purchaseData.getVehicleId(),
                customer,
                purchaseData.getPrice());

        return "redirect:/vehicles";
    }

    public void buyVehicle(Long vehicleId) {
        Customer customer = getCustomerData();
        Long customerPrice = getCustomerPrice();
        sellingService.sell(vehicleId, customer, customerPrice);
    }

    public void showPurchaseHistory() {
        System.out.print("Provide Document Number: ");
        String documentNo = readInput();
        List<Purchase> customerHistory = sellingService.loadHistory(documentNo);
        customerHistory.forEach(System.out::println);
    }

    private Customer getCustomerData() {
        Customer customer = new Customer();
        System.out.println("Provide customer data:");
        System.out.print("   Name: ");
        customer.setName(readInput());
        System.out.print("   Last name: ");
        customer.setLastname(readInput());
        System.out.print("   Document number: ");
        customer.setDocumentNo(readInput());
        System.out.print("   Pesel: ");
        customer.setPesel(readInput());
        return customer;
    }

    private Long getCustomerPrice() {
        while (true) {
            try {
                System.out.print("Selling price for this customer: ");
                return Long.parseLong(readInput());
            } catch (NumberFormatException e) {
                System.out.println("Invalid price. Provide again.");
            }
        }
    }

    private String readInput() {
        return new Scanner(System.in).nextLine();
    }
}
