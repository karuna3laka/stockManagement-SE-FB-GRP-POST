package org.first.stockmanagementservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@DiscriminatorValue("CROP_TOP")
public class CropTop extends Item
{
	@Column(name = "GSM_INDEX")
	private int gsmIndex;

	@Column(name = "COLOR", length = 20)
	private String color;

	@Column(name = "FABRIC_MET", length = 50)
	private String fabricMet;

	@Column(name = "SIZE", length = 100)
	private String size;

	public CropTop( int id, String sellerName, String note, int quantity, LocalDate date, int gsmIndex, String color, String fabric_Met, String size )
	{
		super( id, sellerName, quantity, note, date );

		this.gsmIndex = gsmIndex;
		this.color = color;
		this.fabricMet = fabric_Met;
		this.size = size;
	}

	public CropTop()
	{

	}

	public int getGsmIndex()
	{
		return gsmIndex;
	}

	public void setGsmIndex( int gsmIndex )
	{
		this.gsmIndex = gsmIndex;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor( String color )
	{
		this.color = color;
	}

	public String getFabricMet()
	{
		return fabricMet;
	}

	public void setFabricMet( String fabricMet )
	{
		this.fabricMet = fabricMet;
	}

	public String getSize()
	{
		return size;
	}

	public void setSize( String size )
	{
		this.size = size;
	}
}