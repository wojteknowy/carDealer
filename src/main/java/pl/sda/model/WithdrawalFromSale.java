package pl.sda.model;

import javax.persistence.Column;
import java.util.Date;

public class WithdrawalFromSale extends BaseModel {
        @Column
        private Date date;
}
