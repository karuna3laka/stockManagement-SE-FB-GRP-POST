package org.first.stockmanaging.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Seller_Name;
    private int Quantity;
    private String Note;
    private Date Date;


    public Item(int Id, String Seller_Name, String Note, int Quantity,Date Date) {
        this.Id = Id;
        this.Seller_Name = Seller_Name;
        this.Note = Note;
        this.Quantity = Quantity;
        this.Date =Date;
    }

    public Item() {

    }
}