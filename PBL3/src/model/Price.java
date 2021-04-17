package model;

public class Price extends Time{
	private int id_Time_Yard;
	private int id_Category_Yard;
	private int price;
	public Price() {
		
	}
	public Price(int id_Time_Yard, int id_Category_Yard, int id_Time, int price) {
		this.id_Time_Yard = id_Time_Yard;
		this.id_Category_Yard = id_Category_Yard;
		this.price = price;
	}
	public int getId_Time_Yard() {
		return this.id_Time_Yard;
	}
	public void setId_Time_Yard(int id_Time_Yard) {
		this.id_Time_Yard = id_Time_Yard;
	}
	public int getId_Category_Yard() {
		return this.id_Category_Yard;
	}
	public void setId_Category_Yard(int id_Category_Yard) {
		this.id_Category_Yard = id_Category_Yard;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
