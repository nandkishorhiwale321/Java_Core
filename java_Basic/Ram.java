package java_Basic;

public class Ram {

	public static void main(String[] args) {
		
		
		student S1 = new student();
		
		// Using setter to set values
		S1.setage(22);
		S1.setname ("ANIKET");
		
		 // Using getter to get values
		System.out.println("Name:"+S1.getname());
		System.out.println("Age:"+S1.getage());
		
		// Using setter to set values
		S1.setage(25);
		S1.setname ("AZIM");
		
		 // Using getter to get values
		System.out.println("Name:"+S1.getname());
		System.out.println("Age:"+S1.getage());
		
		
		
		
	}

}
class student{
	
	// private variable
	private int age;
	private String name;
	
	//Getter for age
	public int getage() {
		return age;
	}
	
	//Setter for age
	public void setage(int age) {
		this.age = age;
	}
	
	   // Getter for name
	public String getname() {
		return name;	
	}
	
    // Setter for name
	public void setname(String name) {
		this.name = name;
	}
}