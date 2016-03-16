package com.kintore.bean;

public class FavMenu {

	private String spot;
	private String menu;
	private int times;
	
	
	
	public FavMenu(String spot, String menu, int times) {
		this.spot = spot;
		this.menu = menu;
		this.times = times;
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
	
	
	
}
