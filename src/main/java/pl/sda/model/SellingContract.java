package pl.sda.model;

import javax.persistence.Column;
import java.util.Date;

public class SellingContract extends BaseModel{
    @Column
    private Date date;
    @Column
    private Integer price;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
