package com.ayan.project.cardealer;

import java.util.Random;

public class Vehicals {
	public String vehicalType;
	public String companyName;
	public int seater;
	public double price;
	public String fuelType;
	public double milage;
	private static String carPlateNo;
	
	
	public Vehicals(String vehicalType, String companyName, int seater, double price, String fuelType, double milage) {
		super();
		this.vehicalType = vehicalType;
		this.companyName = companyName;
		this.seater = seater;
		this.price = price;
		this.fuelType = fuelType;
		this.milage = milage;
	}

	public String getVehicalType() {
		return vehicalType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getSeater() {
		return seater;
	}

	public double getPrice() {
		return price;
	}

	public String getFuelType() {
		return fuelType;
	}

	public double getMilage() {
		return milage;
	}
	
	public void setCarPlateNo(String stateOfPurchase) {
		Random r = new Random();

	    String alphabet = "ABCDKEZOPLQE";
	    String varChar ="";
	    for (int i = 0; i < 2; i++) {
	        char var =alphabet.charAt(r.nextInt(alphabet.length()));
	        varChar = varChar + var;
	    }
		
		String twoNo = String.valueOf((int) (Math.random()*100));
		String fourNo =String.valueOf( (int) (Math.random()*10000));
		
		Vehicals.carPlateNo = stateOfPurchase + " " + twoNo + " " + varChar + " " + fourNo;
		
	}
	
	@Override
	public String toString() {
		return "Vehicals [vehicalType=" + vehicalType + ", companyName=" + companyName + ", seater=" + seater
				+ ", price=" + price + ", fuelType=" + fuelType + ", milage=" + milage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((fuelType == null) ? 0 : fuelType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(milage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + seater;
		result = prime * result + ((vehicalType == null) ? 0 : vehicalType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicals other = (Vehicals) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (fuelType == null) {
			if (other.fuelType != null)
				return false;
		} else if (!fuelType.equals(other.fuelType))
			return false;
		if (Double.doubleToLongBits(milage) != Double.doubleToLongBits(other.milage))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (seater != other.seater)
			return false;
		if (vehicalType == null) {
			if (other.vehicalType != null)
				return false;
		} else if (!vehicalType.equals(other.vehicalType))
			return false;
		return true;
	}

	public String getCarPlateNo(){
		return carPlateNo;
		
	}
	
	
	
}
