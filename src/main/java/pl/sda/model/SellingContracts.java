package pl.sda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;
@Entity
public class SellingContracts extends BaseModel implements Serializable {

    @Column
    private Date date;

    @Column
    private Long price;

    @OneToOne
    @JoinColumn(name="idvehicles")
    private Vehicle vehicle;

    @OneToOne
    @JoinColumn(name="idcustomers")
    private Customer customer;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
