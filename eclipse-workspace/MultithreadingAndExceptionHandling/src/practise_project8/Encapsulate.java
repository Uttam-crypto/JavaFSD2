package practise_project8;

public class Encapsulate 
{ 
    private String Name; 
    private int Roll; 
    private int Age;
    public Encapsulate() {
    	
    }
    public int getAge()  
    { 
      return Age; 
    } 
    public String getName()  
    { 
      return Name; 
    } 
    public int getRoll()  
    { 
       return Roll; 
    } 
    public void setAge( int newAge) 
    { 
      this.Age = newAge; 
    } 
    public void setName(String newName) 
    { 
      this.Name = newName; 
    } 
    public void setRoll( int newRoll)  
    { 
      this.Roll = newRoll; 
    } 
}

