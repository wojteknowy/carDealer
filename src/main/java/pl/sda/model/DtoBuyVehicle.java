package pl.sda.model;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

public class DtoBuyVehicle extends BaseModel implements Serializable {


    private String VehicleNrVin;

    private String VehicleYear;

    private String VehicleManufacturer;

    private String VehicleModel;

    private String VehicleNrOc;

    private String VehicleNrRegistrationCar;

    private String VehicleFuel;

    private String VehicleMileage;

    private String VehicleEngine;

    private String VehiclePower;

    private String VehicleTransmission;

    private String VehicleInfo;

    private Integer VehiclePrice;

    private Date BuyDate;

    private Integer BuyPrice;

    public String getVehicleNrVin() {
        return VehicleNrVin;
    }

    public void setVehicleNrVin(String vehicleNrVin) {
        VehicleNrVin = vehicleNrVin;
    }

    public String getVehicleYear() {
        return VehicleYear;
    }

    public void setVehicleYear(String vehicleYear) {
        VehicleYear = vehicleYear;
    }

    public String getVehicleManufacturer() {
        return VehicleManufacturer;
    }

    public void setVehicleManufacturer(String vehicleManufacturer) {
        VehicleManufacturer = vehicleManufacturer;
    }

    public String getVehicleModel() {
        return VehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        VehicleModel = vehicleModel;
    }

    public String getVehicleNrOc() {
        return VehicleNrOc;
    }

    public void setVehicleNrOc(String vehicleNrOc) {
        VehicleNrOc = vehicleNrOc;
    }

    public String getVehicleNrRegistrationCar() {
        return VehicleNrRegistrationCar;
    }

    public void setVehicleNrRegistrationCar(String vehicleNrRegistrationCar) {
        VehicleNrRegistrationCar = vehicleNrRegistrationCar;
    }

    public String getVehicleFuel() {
        return VehicleFuel;
    }

    public void setVehicleFuel(String vehicleFuel) {
        VehicleFuel = vehicleFuel;
    }

    public String getVehicleMileage() {
        return VehicleMileage;
    }

    public void setVehicleMileage(String vehicleMileage) {
        VehicleMileage = vehicleMileage;
    }

    public String getVehicleEngine() {
        return VehicleEngine;
    }

    public void setVehicleEngine(String vehicleEngine) {
        VehicleEngine = vehicleEngine;
    }

    public String getVehiclePower() {
        return VehiclePower;
    }

    public void setVehiclePower(String vehiclePower) {
        VehiclePower = vehiclePower;
    }

    public String getVehicleTransmission() {
        return VehicleTransmission;
    }

    public void setVehicleTransmission(String vehicleTransmission) {
        VehicleTransmission = vehicleTransmission;
    }

    public String getVehicleInfo() {
        return VehicleInfo;
    }

    public void setVehicleInfo(String vehicleInfo) {
        VehicleInfo = vehicleInfo;
    }

    public Integer getVehiclePrice() {
        return VehiclePrice;
    }

    public void setVehiclePrice(Integer vehiclePrice) {
        VehiclePrice = vehiclePrice;
    }

    public Date getBuyDate() {
        return BuyDate;
    }

    public void setBuyDate(Date buyDate) {
        BuyDate = buyDate;
    }

    public Integer getBuyPrice() {
        return BuyPrice;
    }

    public void setBuyPrice(Integer buyPrice) {
        BuyPrice = buyPrice;
    }
}
