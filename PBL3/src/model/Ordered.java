package model;

import java.util.Date;

public class Ordered extends Yard {
	private int id_Order;
	private Date date;

	public Ordered() {
		
	}
	public Ordered(int id_Order, int id_Category_Yard, int id_Yard, Date date, int id_Client) {
		this.id_Order = id_Order; 
		this.date = date;
	}
	public int getId_Order() {
		return this.id_Order;
	}
	public void setId_Order(int id_Order) {
		this.id_Order = id_Order;
	}
	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
