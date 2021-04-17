package model;

import java.util.Date;

public class Bill {
	private int id_Bill;
	private Date create_Time;
	private Date create_Date;
	private int total;
	public Bill() {
		
	}
	public Bill(int id_Bill, Date create_Time, Date create_Date, int total, int id_Employee) {
		this.id_Bill = id_Bill;
		this.create_Time = create_Time;
		this.create_Date = create_Date;
		this.total = total;
	}
	public int getId_Bill() {
		return this.id_Bill;
	}
	public void setId_Bill(int id_Bill) {
		this.id_Bill = id_Bill;
	}
	public Date getCreate_Time() {
		return this.create_Time = create_Time;
	}
	public void setCreate_Time(Date create_Time) {
		this.create_Time = create_Time;
	}
	public Date getCreate_Date() {
		return this.create_Date = create_Date;
	}
	public void setCreate_Date(Date create_Date) {
		this.create_Date = create_Date;
	}
	public int getTotal() {
		return this.total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
