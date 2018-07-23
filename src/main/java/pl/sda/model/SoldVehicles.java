package pl.sda.model;

import org.hibernate.annotations.Entity;

import javax.persistence.Column;
import java.io.Serializable;

@javax.persistence.Entity
public class SoldVehicles extends BaseModel implements Serializable{

    @Column
    private String nrVin;
    @Column
    private String year;
    @Column
    private String manufacturer;
    @Column
    private String model;
    @Column
    private String nrOc;
    @Column
    private String nrRegistrationCar;
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
    private Boolean Sold;
    @Column
    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getSold() {
        return Sold;
    }

    public void setSold(Boolean sold) {
        Sold = sold;
    }

    public String getNrVin() {
        return nrVin;
    }

    public void setNrVin(String nrVin) {
        this.nrVin = nrVin;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNrOc() {
        return nrOc;
    }

    public void setNrOc(String nrOc) {
        this.nrOc = nrOc;
    }

    public String getNrRegistrationCar() {
        return nrRegistrationCar;
    }

    public void setNrRegistrationCar(String nrRegistrationCar) {
        this.nrRegistrationCar = nrRegistrationCar;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
