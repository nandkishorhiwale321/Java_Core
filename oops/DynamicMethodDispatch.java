package oops;

public class DynamicMethodDispatch {
	public static void main (String args []) {
		Bank B = new account();
		B.show();
		
	}

}
class Bank {
	String name = "abcd";
	
	public void show() {
		System.out.println("your welcome in the bank");
	}
}
class Costumer extends Bank{
	public void show() {
		System.out.println("i am costumer");
	}	
}
class account extends Bank {
	public void show() {
		System.out.println("this is my acc.");

	}
}
