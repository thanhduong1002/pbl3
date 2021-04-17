package model;

public class Yard extends Category_Yard{
	private int id_Yard;
	private String name_Yard;
	private boolean status;
	public Yard() {
		
	}
	public Yard(int id_Yard,int id_Category_Yard, String name_Yard, boolean status) {
		this.id_Yard = id_Yard;
		this.name_Yard = name_Yard;
		this.status = status;
	}
	public int getId_Yard() {
		return this.id_Yard;
	}
	public void setId_Yard(int id_Yard) {
		this.id_Yard = id_Yard;
	}
	public String getName_Yard() {
		return this.name_Yard;
	}
	public void setName_Yard(String name_Yard) {
		this.name_Yard = name_Yard;
	}
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
