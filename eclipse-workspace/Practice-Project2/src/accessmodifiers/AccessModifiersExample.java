package accessmodifiers;

//Main class
public class AccessModifiersExample {

         // Public field - accessible from anywhere
		 public String publicField = "This is a public field";
		
		 // Protected field - accessible within the same class, subclass, and package
		 protected String protectedField = "This is a protected field";
		
		 // Default (package-private) field - accessible within the same class and package
		 String defaultField = "This is a default field";
		
		 // Private field - accessible only within the same class
		 private String privateField = "This is a private field";
		
		 // Public method - accessible from anywhere
		 public void publicMethod() {
		     System.out.println("This is a public method");
		 }
		
		 // Protected method - accessible within the same class, subclass, and package
		 protected void protectedMethod() {
		     System.out.println("This is a protected method");
		 }
		
		 // Default (package-private) method - accessible within the same class and package
		 void defaultMethod() {
		     System.out.println("This is a default method");
		 }
		
		 // Private method - accessible only within the same class
		 private void privateMethod() {
		     System.out.println("This is a private method");
		 }

 // Main method
 public static void main(String[] args) {
     // Create an instance of the class
     AccessModifiersExample example = new AccessModifiersExample();

     // Access public members
     System.out.println(example.publicField);
     example.publicMethod();

     // Access protected members (since we are in the same class)
     System.out.println(example.protectedField);
     example.protectedMethod();

     // Access default (package-private) members (since we are in the same class)
     System.out.println(example.defaultField);
     example.defaultMethod();

     // Access private members (since we are in the same class)
     System.out.println(example.privateField);
     example.privateMethod();
 }
}

