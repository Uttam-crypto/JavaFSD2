package methodimplementation;

public class Dog extends Animal {
	// Method overriding
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Additional method specific to Dog
    public void wagTail() {
        System.out.println("Dog wags its tail");
    }

}
