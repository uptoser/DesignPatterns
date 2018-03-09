package me.ibeyond.observer_pattern;

import java.util.Observable;

public class ComputerShop extends Observable {

	private String computerName;
	private double Price;
	private int level;
	
	public void getMsg(){
		notifyObservers();
	}
	
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		setChanged();
		this.computerName = computerName;
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
