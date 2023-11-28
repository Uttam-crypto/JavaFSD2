package constructortypes;

public class ConstructorTypesExample {
	
    public static void main(String[] args) {
        // Using the default constructor
        Person person1 = new Person();
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println();

        // Using the parameterized constructor
        Person person2 = new Person("John", 25);
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
        System.out.println();

        // Using the copy constructor
        Person person3 = new Person(person2);
        System.out.println("Person 3 (Copy of Person 2) - Name: " + person3.getName() + ", Age: " + person3.getAge());
    }
}

