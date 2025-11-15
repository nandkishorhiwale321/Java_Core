package oops;
import java.util.Scanner;


public class Data_Hiding {
	
	// data hiding 

	public static void main(String[] args) {
	Student s =new Student();                       //object creation
	
	Scanner sc = new Scanner(System.in);    //Scanner class for get input from user
	System.out.println("Enter Name:");
	String name = sc.next();
	s.setname(name);
	
	System.out.println("Enter Age:");
	int age = sc.nextInt();
	s.setage(age);
	
	System.out.println("Enter parcetage:");
	double parcetage = sc.nextDouble();
	s.setparcentage(parcetage);
	
	System.out.println("Name :"+s.getname());
	System.out.println("Age :"+s.getage());
	System.out.println("Parcetage :"+s.getparcetage()+"%");
	System.out.println("");

	
	
	
	}

	}



class Student {
	
	private String name;   //private variable
	private int age;
	private double parcetage;
	
	public void setname(String name) {  //setter methods
		
		this.name=name;
		
		if(name.length() > 0) {
			//System.out.println(name);
		}
		else {
			System.out.println("Invalid Name");
		}
		
	}
	
	public void setage (int age) {
		
		this.age = age;
		
		if (age > 5 && age < 100) {
			
		
		}
		else {
			
			System.out.println("Invalid Age");
		}
		
		
	}
	
	public void setparcentage(double parcentage) {
		
		this.parcetage = parcentage;
		
		if (parcentage > 0 && parcentage <= 100 )
		{
			
			}
		else {
			System.out.println("Invalid parcetage");
		}
		
		}
	
	public String getname() {            // getter methods
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public double getparcetage() {
		return parcetage;
	}
	
	
}
