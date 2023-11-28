package typecasting;

public class TypeCastingExample {

    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int intValue = 10;
        double doubleValue = intValue; // Implicit casting from int to double
        System.out.println("Implicit Casting (Widening):");
        System.out.println("int value: " + intValue);
        System.out.println("double value after implicit type casting: " + doubleValue);
        System.out.println();

        // Explicit Casting (Narrowing)
        double anotherDoubleValue = 15.75;
        int anotherIntValue = (int) anotherDoubleValue; // Explicit casting from double to int
        System.out.println("Explicit Casting (Narrowing):");
        System.out.println("double value: " + anotherDoubleValue);
        System.out.println("int value after explicit type casting: " + anotherIntValue);
    }
}

