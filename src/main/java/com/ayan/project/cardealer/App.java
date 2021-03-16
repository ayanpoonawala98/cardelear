package com.ayan.project.cardealer;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	
//    	Vehicals honda = new Vehicals("seaden","Honda",4,1000000,"petrol",25);
//    	honda.setCarPlateNo(stateOfPurchase);
//    	System.out.println(honda.getCarPlateNo());
    	
    	Customers cust1 = new Customers();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Your Name ::\t");
    	cust1.setName(sc.next());
    	System.out.println("Enter Your Address ::\t");
    	cust1.setAddress(sc.next());
    	System.out.println("Enter Your OnHandAmount ::\t");
    	cust1.setCashOnHand(sc.nextDouble());
    	System.out.println("Finance true/false ::\t");
    	cust1.setFinance(sc.nextBoolean());
    	System.out.println("Enter the name of vehicle :: \t");
    	String custveh = sc.next();
    	
    	Vehicals veh = new Vehicals("car", "Honda", 4, 1000000, "Diesal",25 );
    	Vehicals veh2 = new Vehicals("car", "BMW", 4, 30000000, "Diesal",20 );
    	
    	Employee emp = new Employee();
    	emp.setName("Harry");
    	if(custveh.equals(veh.getCompanyName())) {
    		cust1.purchaseCar(veh, emp, cust1.isFinance());
    		
    	}else if(custveh.equals(veh2.getCompanyName())) {
    		cust1.purchaseCar(veh2, emp, cust1.isFinance());
    	}
    	
    	
    	
    	//cust1.purchaseCar(veh, emp, false);
    }
}
