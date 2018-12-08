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
package week1.day1;

public class BiCycle {
	public String brand = "BSA";
	public boolean hasBasket = false;

	public void rideCycle() {
		System.out.println("I am riding cycle");
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
