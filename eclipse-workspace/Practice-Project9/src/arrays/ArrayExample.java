package arrays;

public class ArrayExample {

    public static void main(String[] args) {
        // Declaration and Initialization of an array of integers
        int[] intArray = new int[5];
        
        // Assigning values to array elements
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        // Displaying elements of the integer array
        System.out.println("Integer Array Elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        // Declaration, Initialization, and Displaying of an array of strings
        String[] stringArray = {"Apple", "Banana", "Orange", "Grapes", "Mango"};

        System.out.println("\nString Array Elements:");
        for (String fruit : stringArray) {
            System.out.println(fruit);
        }

        // Multidimensional array (2D array)
        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("\nTwo-Dimensional Array Elements:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

