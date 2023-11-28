package methodimplementation;

public class MethodExample {

    // Static method with no parameters and no return value
    public static void staticMethod() {
        System.out.println("This is a static method with no parameters and no return value.");
    }

    // Static method with parameters and return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Non-static method with parameters and return value
    public double multiply(double x, double y) {
        return x * y;
    }

    // Non-static method with no parameters and no return value
    public void displayMessage() {
        System.out.println("This is a non-static method with no parameters and no return value.");
    }

    public static void main(String[] args) {
        // Calling a static method
        staticMethod();

        // Calling a static method with parameters and return value
        int result = add(5, 3);
        System.out.println("Result of addition: " + result);

        // Creating an instance of the class to call non-static methods
        MethodExample instance = new MethodExample();

        // Calling a non-static method with parameters and return value
        double product = instance.multiply(4.5, 2.0);
        System.out.println("Result of multiplication: " + product);

        // Calling a non-static method with no parameters and no return value
        instance.displayMessage();
    }
}


