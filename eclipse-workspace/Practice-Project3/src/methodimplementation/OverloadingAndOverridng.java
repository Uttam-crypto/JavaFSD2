package methodimplementation;

public class OverloadingAndOverridng {
	public static void main(String[] args) {
        // Method overloading
        Animal animal = new Animal();
        animal.makeSound();             // Calls the first makeSound method
        animal.makeSound("Roar");       // Calls the second makeSound method

        // Method overriding
        Dog dog = new Dog();
        dog.makeSound();                // Calls the overridden makeSound method in Dog
        dog.wagTail();                  // Calls the method specific to Dog

        // Polymorphism - Using the base class reference to refer to a derived class object
        Animal polymorphicDog = new Dog();
        polymorphicDog.makeSound();     // Calls the overridden makeSound method in Dog

        // Casting to access the specific method in Dog
        ((Dog) polymorphicDog).wagTail();  // Calls the method specific to Dog using casting
    }

}
