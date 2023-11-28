package methodimplementation;

public class Animal {
	 // Method overloading in the same class
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }

    // Method overloading with a different parameter
    public void makeSound(String sound) {
        System.out.println("Animal makes the sound: " + sound);
    }

}
