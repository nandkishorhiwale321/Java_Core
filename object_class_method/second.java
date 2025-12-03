package object_class_method;

public class second {

	public static void main(String [] args) {
		
		Hospital h =new Hospital();
		Hospital h2 =new Hospital();
		
		h.Pacent_Name="sunny";
		h.Room_No=101;
		
		h2.Pacent_Name="bunny";
		h2.Room_No=102;
		
		System.out.println(h.hashCode());
		System.out.println(h2.hashCode());
		
		
		
	}
}
class Hospital {
	
	int Room_No;
	String Pacent_Name;
	
	public int hashCode() {
		return 1000;
	}
}
