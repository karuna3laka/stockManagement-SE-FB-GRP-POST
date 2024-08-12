package org.first.stockmanaging.model.subModels;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import org.first.stockmanaging.model.Item;

@Entity
@Data
@DiscriminatorValue("T_Shirts")
public class T_shirts extends Item {
    public int getGSM_Index() {
        return GSM_Index;
    }

    public void setGSM_Index(int GSM_Index) {
        this.GSM_Index = GSM_Index;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getFabric_Met() {
        return Fabric_Met;
    }

    public void setFabric_Met(String fabric_Met) {
        Fabric_Met = fabric_Met;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    private int GSM_Index;
    private String Color;
    private String Fabric_Met;
    private String Size;

    public T_shirts(int id, String sellerName, String note, int quantity, java.util.Date date, int GSM_Index, String color, String fabricMet, String size) {
        super(id, sellerName, note, quantity, date);
        this.GSM_Index = GSM_Index;
        this.Color = color;
        this.Fabric_Met = fabricMet;
        this.Size = size;
    }

    public T_shirts() {
        super();
    }
}
