import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner ( System.in);
		 
		double number1;
		double number2;
		 
		String operation;
		 
		System.out.printf("Enter number 1: "); 
		number1 = input.nextDouble();
		
		System.out.printf("Enter number 2: ");
		number2 = input.nextDouble();
		
		System.out.printf("Enter opperation desired: ");
		operation = input.next();
		
		switch (operation) {
			case "+": System.out.println("Result: " + (number1 + number2)); break;
			case "-": System.out.println("Result: " + (number1 - number2)); break;
			case "/": System.out.println("Result: " + (number1 / number2)); break;
			case "*": System.out.println("Result: " + (number1 * number2)); break;
		}
	}

}
