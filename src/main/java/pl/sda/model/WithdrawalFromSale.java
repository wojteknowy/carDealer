package pl.sda.model;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

public class WithdrawalFromSale extends BaseModel implements Serializable{
        @Column
        private Date date;
}
