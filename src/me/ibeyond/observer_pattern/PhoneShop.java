package me.ibeyond.observer_pattern;

import java.util.Observable;

public class PhoneShop extends Observable {

	private String phoneName;
	private double Price;
	private int level;
	
	public void getMsg(){
		notifyObservers();
	}
	
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		setChanged();
		this.phoneName = phoneName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		setChanged();
		Price = price;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		setChanged();
		this.level = level;
	}




	
}
