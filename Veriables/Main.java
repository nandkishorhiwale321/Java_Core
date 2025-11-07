package Veriables;

public class Main {

	public static void main(String[] args) {
City A = new City();
City B = new City();

A.name = "malkapur";
A.pincode = 121212;
A.state = "MH";

B.name ="buldhana";
B.pincode =125436;
B.state = "GR";
//System.out.println("Name:"+A.name+"\nPincode:"+A.pincode+"\nState:"+A.state+"\n"+"\nName:"+B.name+"\nPincode:"+B.pincode+"\nState:"+B.state);

A.display();
System.out.println();
B.display();

	}

}
class City{
	int pincode;
	String name;
	static  String state;
	final String Country = "INDIA";
	 
	 
	 public void display () {
		System.out.println("Name:"+name+"\nPincode:"+pincode+"\nState:"+state+"\n"+"\nName:"+name+"\nPincode:"+pincode+"\nState:"+state);
	 }
}
