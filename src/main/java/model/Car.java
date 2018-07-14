package model;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Car extends BaseModel implements Serializable {

    private String nr_vin;
    private String year;
    private String maufacturer;
    private String model;
    private String nr_oc;
    private String nr_registration_car;
    private String fuel;
    private String mileage;
    private String engine;
    private String power;
    private String transmission;
    private String description;
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

    public String getMaufacturer() {
        return maufacturer;
    }

    public void setMaufacturer(String maufacturer) {
        this.maufacturer = maufacturer;
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
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNr_test_drivers() {
        return nr_test_drivers;
    }

    public void setNr_test_drivers(Integer nr_test_drivers) {
        this.nr_test_drivers = nr_test_drivers;
    }
}
