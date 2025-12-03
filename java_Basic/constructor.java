package java_Basic;

public class constructor {

	public static void main(String[] args) {
		
    	Metro M= new Metro(12,33);                           //creating objects and passing values 
    	
        Metro M1 = new Metro();
        
        Metro M2 = new Metro(-23);
	}
}

class Metro{
	                                                                  
	public  Metro() {                                         //Creating a non parameterized constructor
		
	System.out.println("This is non parameterized constructor");
	
	System.out.println("");
	}
	
	public Metro(int a ,int b) {                              //Creating a parameterized constructor
		
		int Z =a+b;

	
		System.out.println("parameterized constructor"+"\nSum:"+Z);
		
		System.out.println("");
	}
	public Metro (int s) {
		int age = s;
		
		if(age<18 && age >0) {
			System.out.println(" You are not adult.....");
		}else if(age>18 && age <100){
			System.out.println("You are adult........");
		}else if(age<0) {
			System.out.println("Enter correct age");
	}
}}
