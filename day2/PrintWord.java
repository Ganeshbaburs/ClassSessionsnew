package week1.day2;

public class PrintWord {

	public static void main(String[] args) {
		String data = "Welcome To Automation World";
		String[] split = data.split(" ");
		for (String eachWord : split) {  
			 if(eachWord.startsWith("W") || eachWord.endsWith("n"))
			 System.out.println(eachWord);
		}

	}

}
