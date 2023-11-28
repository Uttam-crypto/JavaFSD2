package innerclass;

//Outer class
public class OuterClass {

		 // Member variable in the outer class
		 private int outerVariable = 10;
		
		 // Non-static inner class
		 public class InnerClass {
		     // Member variable in the inner class
		     private int innerVariable = 5;
		
		     // Method in the inner class accessing outer class members
		     public void display() {
		         System.out.println("Outer Variable: " + outerVariable);
		         System.out.println("Inner Variable: " + innerVariable);
		  }
		 }

         // Static nested class
		 public static class StaticNestedClass {
		     // Static member variable in the nested class
		     private static int staticVariable = 20;
		
		     // Static method in the nested class
		     public static void staticDisplay() {
		         System.out.println("Static Nested Class - Static Variable: " + staticVariable);
		     }
 }

 public static void main(String[] args) {
     // Creating an instance of the outer class
     OuterClass outerObject = new OuterClass();

     // Creating an instance of the inner class
     OuterClass.InnerClass innerObject = outerObject.new InnerClass();

     // Calling the display method of the inner class
     innerObject.display();

     // Creating an instance of the static nested class
     OuterClass.StaticNestedClass staticNestedObject = new OuterClass.StaticNestedClass();

     // Calling the static method of the static nested class
     OuterClass.StaticNestedClass.staticDisplay();
 }
}

