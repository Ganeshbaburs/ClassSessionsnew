package week1.day1;

public class MyCycle {
	public static void main(String[] args) {
		// syntax to call another class
		// ClassName objectName = new ClassName();
		BiCycle myCycle = new BiCycle();
		// syntax to call a method
		// objectName.methodName();
		/*boolean puncture = myCycle.isPuncture();
		System.out.println(puncture);
		String color = myCycle.getColor();
		System.out.println(color);
		myCycle.rideCycle();
		String brand = myCycle.brand;
		System.out.println(brand);
		boolean hasBasket = myCycle.hasBasket;
		System.out.println(hasBasket);*/
		String bicycleColor = myCycle.getColor("a");
		System.out.println(bicycleColor);
		System.out.println(myCycle.getCount(10));
		
		
	}

}


