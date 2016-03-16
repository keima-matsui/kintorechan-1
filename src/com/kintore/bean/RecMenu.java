package com.kintore.bean;

public class RecMenu {

	private String spot;
	private String menu;
	private int times;
	private String time;

	
	public RecMenu(String spot, String menu, int times, String time) {
	
		this.spot = spot;
		this.menu = menu;
		this.times = times;
		this.time = time;
	}


	public String getSpot() {
		return spot;
	}


	public void setSpot(String spot) {
		this.spot = spot;
	}


	public String getMenu() {
		return menu;
	}


	public void setMenu(String menu) {
		this.menu = menu;
	}


	public int getTimes() {
		return times;
	}


	public void setTimes(int times) {
		this.times = times;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}
	
	
	
}
