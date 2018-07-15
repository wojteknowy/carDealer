package pl.sda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Worker extends BaseModel implements Serializable{

    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private String adress;
    @Column (name = "date_of_employment")
    private String dateOfEmployment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }
}
