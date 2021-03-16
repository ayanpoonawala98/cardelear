package com.ayan.project.cardealer;

public class Customers {

	private String name;
	private String address;
	private double cashOnHand;
	//private long phoneNo;
	String stateOfPurchase="MH";
	private boolean finance ;
	
	
	public boolean isFinance() {
		return finance;
	}
	public void setFinance(boolean finance) {
		this.finance = finance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	public void purchaseCar(Vehicals veh,Employee emp,boolean finance ) {
		emp.handleCustomer(this, finance, veh,stateOfPurchase);
	}
}
