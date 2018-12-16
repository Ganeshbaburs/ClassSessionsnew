package week2.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnExceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		try {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
			System.out.println(num1/num2);
			if(num2>5) {
				throw new NullPointerException();
			}
		} catch (ArithmeticException e) {
			System.err.println("should not enter zero");
		} catch (InputMismatchException e) {
			System.err.println("Enter only numbers");
		} /*catch (Exception e) {
			System.err.println("Something went wrong");
		}*/ finally {
			System.out.println("Always runnable");  
		} 

	}

}
