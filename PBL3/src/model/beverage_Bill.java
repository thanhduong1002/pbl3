package model;

public class beverage_Bill {
	private int id_beverage_Bill;
	private int mount;
	public beverage_Bill() {
		
	}
	public beverage_Bill(int id_beverage_Bill, int id_Beverage, int mount) {
		this.id_beverage_Bill = id_beverage_Bill;
		this.mount = mount;
	}
	public int getId_beverage_Bill() {
		return this.id_beverage_Bill;
	}
	public void setId_beverage_Bill(int id_beverage_Bill) {
		this.id_beverage_Bill = id_beverage_Bill;
	}
	public int getMount() {
		return this.mount;
	}
	public void setMount(int mount) {
		this.mount = mount;
	}
}
