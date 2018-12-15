package week2.day1;

public class StaticDemo {

	//constructor
	/*public StaticDemo(){
		System.out.println("i am constructor");  
	}*/
	int num2 =1;
	static int num =1;
	public void increment() {
		num2++;
		num++;
		System.out.println("ins: "+num2+" sta: "+num);
	}  
	public static void main(String[] args) {
		//int num3 = 10;
		StaticDemo demo =new StaticDemo();
		demo.increment();
		demo.increment();
		StaticDemo demo1 =new StaticDemo();
		demo1.increment();
		demo1.increment();
		 //StaticDemo.display(); 
		/*System.out.println(num3);  
		display();*/
	}
	/*static {
		num =20;
		System.out.println("i am static block 1");
	}
	static {
		System.out.println("i am static block 2");
	}*/
	public static void display() {
		System.out.println("display"); 
	}
}



