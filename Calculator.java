package calculatorPackage;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter operation symbol(+,-,*,/)");
		String symbol = scanner.next();
		
		System.out.println("Enter second number: ");
		double num2 = scanner.nextDouble();
		
		double total = 0;
		
		switch(symbol) {
		
		case("+"):
			total = num1 + num2;
			break;
		
		case("-"):
			total = num1 - num2;
			break;
		
		case("*"):
			total = num1 * num2;
			break;
			
		case("/"):
			if(num2 == 0) {
				System.out.println("Error: Cannot divide by zero!");
				scanner.close();
				return;
			}
			total = num1 / num2;
			break;
		
		default:
			System.out.println("Invalid operator entered. Enter(+,-,*,/).");
			scanner.close();
			return;
		}
		
		System.out.println("The outcome is: " + total);
		
		scanner.close();
		
	}

}
