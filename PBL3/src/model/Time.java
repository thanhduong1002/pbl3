package model;

import java.util.Date;

public class Time {
	private int id_Time;
	private Date Time;
	public Time() {
		
	}
	public Time(int id_Time, Date Time) {
		this.id_Time = id_Time;
		this.Time = Time;
	}
	public int getId_Time() {
		return this.id_Time;
	}
	public void setId_Time(int id_Time) {
		this.id_Time = id_Time;
	}
	public Date gettime() {
		return this.Time;
	}
	public void settime(Date Time) {
		this.Time = Time;
	}
}
