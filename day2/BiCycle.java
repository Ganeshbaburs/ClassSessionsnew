// method - 1. rideCycle - 2. ringBell 3. doRide
// method signature 
// access_modifier return_type method_name (arguments)
// public, private, protected & default
// return type - 
// Text = String, with in double quote " "
// char =  with in single quote ' '
// Numbers = short, int, long, 
// Decimals = float, double
// boolean = true or false
// void = No return 

// syntax for variable
// access_modifier dataType variableName = value;
package week1.day2;

import java.util.Scanner;

public class BiCycle {
	public String brand = "BSA";
	public boolean hasBasket = false;

	public void rideCycle() {
		System.out.println("I am riding cycle");
		displayAllBrands();
	}

	public void displayAllBrands() {
		
		String brandName[] = new String[5];
		System.out.println("Enter brand names");
		Scanner sc = new Scanner(System.in);  
		for(int i=0; i<brandName.length; i++) {
			System.out.println("brand name: "+(i+1));
		brandName[i]= sc.next();
		}  
		//String[] brandName = {"Hero", "BSA", "LadyBird","Atlas","ABC"};
		for(String eachBrandName : brandName) {
			System.out.println(eachBrandName);
		} 
		//for(int i=0; i<=brandName.length; i++)
		//i=i+1
		/*int i =3;
		do {
			System.out.println(brandName[i]);
			i++;
		} while(i<3);*/
		/*while(i<brandName.length) { 
			System.out.println(brandName[i]);
			i++;
		}*/
	}









	public String getColor() {
		return "blue";
	}
	// method overloading
	// syntax
	/*
	 * if(condition == true) {
			true statement
		} else {
			false statement
		}
	 */
	public String getColor(String whose) {
		if(whose.equalsIgnoreCase("wife")) {
			return "red"; 
		}else if(whose.equalsIgnoreCase("daughter")){
			return "pink";
		}else if(whose.equalsIgnoreCase("son")) {
			return "blue";
		}else {
			return "give input as wife or daughter or son";	
		}
	}
	public int getCount(int doorNum) {
		if (doorNum == 10) {
			return 2;
		}else if(doorNum == 12) {
			return 3;
		} else {
			return 0;
		}
	}
	public boolean isPuncture() {
		return true;
	}

}
