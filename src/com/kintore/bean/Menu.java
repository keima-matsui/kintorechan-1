package com.kintore.bean;

public class Menu {

	private int id;
	private String menu;
	private String spot;
	private int times;
	
	public Menu(int id, String menu,String spot,int times) {
		this.id = id;
		this.menu = menu;
		this.spot = spot;
		this.times = times;
	}
	
	

	public String getSpot() {
		return spot;
	}



	public void setSpot(String spot) {
		this.spot = spot;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
