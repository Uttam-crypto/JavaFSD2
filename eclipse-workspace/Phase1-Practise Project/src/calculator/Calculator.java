package calculator;

public class Calculator {
    // Instance variables
    private double operand1;
    private double operand2;

    // Constructor
    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // Addition method
    public double add() {
        return operand1 + operand2;
    }

    // Subtraction method
    public double subtract() {
        return operand1 - operand2;
    }

    // Multiplication method
    public double multiply() {
        return operand1 * operand2;
    }

    // Division method
    public double divide() {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; // NaN (Not a Number) represents an undefined or unrepresentable value
        }
    }
}

