package pl.sda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Vehicle extends BaseModel implements Serializable {
    @Column
    private String nr_vin;
    @Column
    private String year;
    @Column
    private String manufacturer;
    @Column
    private String model;
    @Column
    private String nr_oc;
    @Column
    private String nr_registration_car;
    @Column
    private String fuel;
    @Column
    private String mileage;
    @Column
    private String engine;
    @Column
    private String power;
    @Column
    private String transmission;
    @Column
    private String info;
    @Column
    private Integer nr_test_drivers;

    public String getNr_vin() {
        return nr_vin;
    }

    public void setNr_vin(String nr_vin) {
        this.nr_vin = nr_vin;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNr_oc() {
        return nr_oc;
    }

    public void setNr_oc(String nr_oc) {
        this.nr_oc = nr_oc;
    }

    public String getNr_registration_car() {
        return nr_registration_car;
    }

    public void setNr_registration_car(String nr_registration_car) {
        this.nr_registration_car = nr_registration_car;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDescription() {
        return info;
    }

    public void setDescription(String description) {
        this.info = description;
    }

    public Integer getNr_test_drivers() {
        return nr_test_drivers;
    }

    public void setNr_test_drivers(Integer nr_test_drivers) {
        this.nr_test_drivers = nr_test_drivers;
    }
}
