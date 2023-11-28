package calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Get user input for operands
        System.out.print("Enter First Number: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter Second Number: ");
        double operand2 = scanner.nextDouble();
        
        // Get user input for operation
        System.out.print("Choose operation from (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Create Calculator object
        Calculator calculator = new Calculator(operand1, operand2);

        // Perform the selected operation
        double result = 0.0;
        switch (operation) {
            case '+':
                result = calculator.add();
                break;
            case '-':
                result = calculator.subtract();
                break;
            case '*':
                result = calculator.multiply();
                break;
            case '/':
                result = calculator.divide();
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
	}

}
