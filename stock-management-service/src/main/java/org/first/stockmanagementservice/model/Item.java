package org.first.stockmanagementservice.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ITEMS")
@DiscriminatorColumn(name = "ITEM_TYPE", discriminatorType = DiscriminatorType.STRING)
public class Item
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, updatable = false)
	private long id;

	@Column(name = "SELLER_NAME", length = 100)
	private String sellerName;

	@Column(name = "QUANTITY")
	private int quantity;

	@Column(name = "NOTE")
	private String note;

	@Column(name = "ITEM_DATE")
	private LocalDate date;

	@Column(name = "ITEM_TYPE", updatable = false, insertable = false)
	private String itemType;

	public Item()
	{

	}

	public Item( int id, String sellerName, int quantity, String note, LocalDate date )
	{
		this.id = id;
		this.sellerName = sellerName;
		this.quantity = quantity;
		this.note = note;
		this.date = date;
	}

	public long getId()
	{
		return id;
	}

	public void setId( long id )
	{
		this.id = id;
	}

	public String getSellerName()
	{
		return sellerName;
	}

	public void setSellerName( String sellerName )
	{
		this.sellerName = sellerName;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity( int quantity )
	{
		this.quantity = quantity;
	}

	public String getNote()
	{
		return note;
	}

	public void setNote( String note )
	{
		this.note = note;
	}

	public LocalDate getDate()
	{
		return date;
	}

	public void setDate( LocalDate date )
	{
		this.date = date;
	}

	public String getItemType()
	{
		return itemType;
	}

	public void setItemType( String itemType )
	{
		this.itemType = itemType;
	}
}