package model;

public class Category_Yard {
	private int id_Category_Yard;
	private String name_Category_Yard;
	public Category_Yard (){
		
	}
	public Category_Yard(int id_Category_Yard, String name_Category_Yard) {
		this.id_Category_Yard = id_Category_Yard;
		this.name_Category_Yard = name_Category_Yard;
	}
	public int getId_Category_Yard() {
		return this.id_Category_Yard;
	}
	public void setId_Category_Yard(int id_Category_Yard) {
		this.id_Category_Yard = id_Category_Yard;
	}
	public String getName_Category_Yard() {
		return this.name_Category_Yard;
	}
	public void setName_Category_Yard(String name_Category_Yard) {
		this.name_Category_Yard = name_Category_Yard;
	}
}
