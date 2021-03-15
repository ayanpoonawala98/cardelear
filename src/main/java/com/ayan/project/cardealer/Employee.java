 package com.ayan.project.cardealer;

public class Employee {
	
private String name;

//	private String address;
	
	
	public String getName() {
	return name;
}


	public void setName(String name) {
		this.name = name;
	}


	public void handleCustomer(Customers cust,boolean finance,Vehicals veh,String state) {
		System.out.println("hi my name is "+name);
		System.out.println("Welcome to DealerShip ...." + "Mr." +cust.getName());
		if(finance == true) {
			double loanAmount = veh.getPrice() - cust.getCashOnHand();
			getCreditHistory(veh,cust,loanAmount,state);
			}
		else if(veh.getPrice() <= cust.getCashOnHand()) {
			System.out.println("Congrulation, You can buy a car");
			System.out.println("ThankYou for Buying a car");
			System.out.println(veh.toString());
			veh.setCarPlateNo(state);
			System.out.println("Your car No plate is \" " + veh.getCarPlateNo() + " \"");
		}
		else {
			System.out.println("So sorry you are not eligible for buying "+ veh.getCompanyName() +
					" Because you have insufficient Cash on hand ");
		}
	}


	private void getCreditHistory(Vehicals veh,Customers cust, double loanAmount,String state) {
		System.out.println("Congrulation,You have financed by Bank");
		System.out.println("your are Eligible to buy " + veh.getCompanyName() );
		System.out.println(loanAmount + " is paid by Bank");
		veh.setCarPlateNo(state);
		System.out.println("Your car No plate is " + veh.getCarPlateNo());
		
	}

}
