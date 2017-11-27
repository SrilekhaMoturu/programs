package com.mtc.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="vendors")
public class vendors {
	@Id
	@Column(name="vendor_ID")
	private int Id;
	@Column(name="vendor_Name")
	private String Name;
	@Column(name="vendor_Quantity")
	private int Quantity;
	@Column(name="vendor_ArrivalDate")
	private Date ArrivalDate;
	@Column(name="vendor_Cost")
	private float cost;
	
   public  vendors()   
   {
	   
	
}

public vendors(int id, String name, int quantity, Date arrivalDate, float cost) {
	super();
	Id = id;
	Name = name;
	Quantity = quantity;
	ArrivalDate = arrivalDate;
	this.cost = cost;
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getQuantity() {
	return Quantity;
}

public void setQuantity(int quantity) {
	Quantity = quantity;
}

public Date getArrivalDate() {
	return ArrivalDate;
}

public void setArrivalDate(Date arrivalDate) {
	ArrivalDate = arrivalDate;
}

public float getCost() {
	return cost;
}

public void setCost(float cost) {
	this.cost = cost;
}
	

}
