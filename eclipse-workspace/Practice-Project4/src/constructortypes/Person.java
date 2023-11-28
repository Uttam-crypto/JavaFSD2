package constructortypes;

public class Person {
		private String name;
	    private int age;
	
	    // Default constructor
	    public Person() {
	        System.out.println("Default Constructor: Creating a person object with default values");
	        this.name = "Unknown";
	        this.age = 0;
	    }
	
	    // Parameterized constructor
	    public Person(String name, int age) {
	        System.out.println("Parameterized Constructor: Creating a person object with provided values");
	        this.name = name;
	        this.age = age;
	    }
	
	    // Copy constructor
	    public Person(Person otherPerson) {
	        System.out.println("Copy Constructor: Creating a person object by copying another person's values");
	        this.name = otherPerson.name;
	        this.age = otherPerson.age;
	    }
	
	    // Getter methods
	    public String getName() {
	        return name;
	    }
	
	    public int getAge() {
	        return age;
	    }
}
