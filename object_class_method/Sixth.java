package object_class_method;

import java.util.Objects;

public class Sixth {
	public static void main (String [] args) {
		
		Hostel_2 h1 = new Hostel_2("h1-boys hostel",101,1222);
		Hostel_2 h2 = new Hostel_2 ("h1-boys hostel",101,1222);
		
		System.out.println(h1.equals(h2));
		System.out.println("******************************");
		System.out.println("h1 hashcode: "+h1.hashCode());
		System.out.println("h2 hashcode: "+h2.hashCode());
		System.out.println(h1.hashCode()==h2.hashCode());
	}

}

class Hostel{
	String name;
	int RoomNumber;
	
	 Hostel(String name, int RoomNumber){
		 
		 this.name=name;
		 this.RoomNumber=RoomNumber;
	 }
	 
	 
	// public boolean equals(Object o) {
		 
	//	 Hostel H =(Hostel)o;
		 
		// return this.name.equals(H.name) && this.RoomNumber==H.RoomNumber; 
	// }
}
class Hostel_2 extends Hostel{
	
	int bednumber;

	Hostel_2(String name, int RoomNumber, int bednumber) {
	
		super(name, RoomNumber);
		this.bednumber =bednumber;
	}
	public int hashCode() {
		 
		 return Objects.hash(name,RoomNumber,bednumber);
	 }
		
		public boolean equals(Object o) {
			 
			 Hostel_2 H =(Hostel_2)o;
			 
			 return this.name.equals(H.name) && this.RoomNumber==H.RoomNumber && this.bednumber== H.bednumber; 
		 
	}
	
}