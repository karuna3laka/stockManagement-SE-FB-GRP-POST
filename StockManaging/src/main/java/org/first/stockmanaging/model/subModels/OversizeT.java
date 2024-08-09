package org.first.stockmanaging.model.subModels;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import org.first.stockmanaging.model.Item;
@Entity
@DiscriminatorValue("OversizeT")
public class OversizeT extends Item {
    private int GSM_Index;
    private String Color;
    private String Fabric_Met;
    private String Size;


    public OversizeT(int Id, String Seller_Name, String Note, int Quantity, java.util.Date Date, int GSM_Index, String color, String fabric_Met, String size) {
        super(Id, Seller_Name, Note, Quantity, Date);

        this.GSM_Index = GSM_Index;
        this.Color = color;
        this.Fabric_Met = fabric_Met;
        this.Size = size;
    }

    public OversizeT() {

    }
}