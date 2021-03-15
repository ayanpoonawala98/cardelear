package com.ayan.project.cardealer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//    	Vehicals honda = new Vehicals("seaden","Honda",4,1000000,"petrol",25);
//    	honda.setCarPlateNo(stateOfPurchase);
//    	System.out.println(honda.getCarPlateNo());
    	
    	Customers cust1 = new Customers();
    	cust1.setAddress("india");
    	cust1.setCashOnHand(1000000);
    	cust1.setName("Tom");
    	
    	Vehicals veh = new Vehicals("car", "Honda", 4, 1000000, "Diesal",25 );
    	Vehicals veh2 = new Vehicals("car", "BMW", 4, 30000000, "Diesal",20 );
    	
    	Employee emp = new Employee();
    	emp.setName("Harry");
    	
    	cust1.purchaseCar(veh, emp, false);
    }
}
