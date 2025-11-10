package oops;

public class Abstract_2 {
	public  static void main(String [] args) {
		
		
		vehicle C = new Car();
		System.out.println("*****CAR*****");
		C.Company("mahindra");
		C.Model("LXT RWD Diesel");
		C.Mileage("30 KM/H");
		System.out.println("Price :"+C.Price());
		System.out.println("Seat  :"+C.NoOFSeat());
		System.out.println("While :"+C.NoOfWhile());
		
		Auto a = new Auto();
		System.out.println("\n*****Auto*****");
		a.Company("BAJAJ");
		a.Model("Bajaj Maxima Z");
		a.Mileage("35 KM/H");
		System.out.println("Price   :"+a.Price());
		System.out.println("Seat    :"+a.NoOFSeat());
		System.out.println("while   :"+a.NoOfWhile());
		
		vehicle b = new Bus();
		System.out.println("\n*****BUS*****");
		b.Company("TATA MOTERS");
		b.Model("CityRide 50 Seater LP 812/52");
		b.Mileage("28 KM/H");
		System.out.println("Price  :"+b.Price());
		System.out.println("Seat   :"+b.NoOFSeat());
		System.out.println("While  :"+b.NoOfWhile());
	}

}
abstract class vehicle {
	
	abstract int NoOfWhile();
	

		
	

	String str;
	public void Company(String str) {
		this.str = str;
	
		System.out.println("Company :"+str);
	}
	
	String str1;
	public void Model(String str1) {
		this.str1 = str1;
		System.out.println("Model :"+str1);
	}
	
	abstract double Price();
	
	String str2;
	 void Mileage(String str2) {
		 this.str2 = str2;
		 System.out.println("Mileage :"+str2);
		 
	 }
	
	abstract int NoOFSeat();
	
	
	
}
class Car extends vehicle {

   public int NoOfWhile() {
		
		return 4;
	}
	
   String str;
	public void  Company() {
		System.out.println("company :"+str);
	}
	
	String str1;
	public void Model() {
		
		System.out.println("Model :"+str1);
	}
	
	public double Price() {
		return 2500000.12;
		
		
	}
	
	String str2;
	 void Mileage() {
		 this.str2 = str2;
		 System.out.println("Mileage :"+str2);
		 
	 }	
	public int NoOFSeat() {
		return 4;
		
	}
}
class Auto extends vehicle {

	@Override
	public int NoOfWhile() {
		
		return 3;
	}

	String str;
	public void  Company() {
		System.out.println("company  :"+str);
	}

	String str1;
	public void Model() {
		System.out.println("Model     :"+str1);
	}

	@Override
	public double Price() {
		
		return 350000.11;
	}

	
	
	String str2;
	 void Mileage() {
		 this.str2 = str2;
		 System.out.println("Mileage :"+str2);
		 
	 }

	@Override
	public int NoOFSeat() {
		
		return 4;
	}
	
}
class Bus extends vehicle {

	@Override
	public int NoOfWhile() {
		
		return 6;
	}

	
	String str;
	public void  Company() {
		System.out.println("company :"+str);
	}
	
	String str1;
	public void Model() {
		System.out.println("Model :"+str1);
	}

	@Override
	public double Price() {
		
		return 300000.123;
	}

	String str2;
	 void Mileage() {
		 this.str2 = str2;
		 System.out.println("Mileage :"+str2);
		 
	 }

	@Override
	public int NoOFSeat() {

		return 50;
	}
	
}
