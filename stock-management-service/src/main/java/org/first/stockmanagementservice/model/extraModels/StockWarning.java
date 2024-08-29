package org.first.stockmanagementservice.model.extraModels;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.first.stockmanagementservice.model.Item;

@Entity
public class StockWarning extends Item {
    private String massage;


    public void setMassage(String massage) {
        this.massage = massage;
    }

    public  StockWarning(String massage)
    {
        this.massage = massage ;
    }
}
