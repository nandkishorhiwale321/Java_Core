package oops;

public class Interface_BWC {
	
	public static void main (String [] args) {
		
		Vehicle v = new Bike();
		v.Start();
		v.Stop();
		v.fuel();
		
		System.out.println("____________________________________________________________");
		
		car C = new car();
          C.Start();
          C.Stop();
          C.fuel();
          
          System.out.println("__________________________________________________________");
          
		
		Bike bike  = new Bike();
		
		bike.repair();
		
		
		
		
	}

}
interface Vehicle {
	
	void Start();
	
    void Stop();
	
    default void fuel() {
        System.out.println("⛽ Filling Fuel... Please wait.");
	
}
    }
interface Garage {
	
	default void repair() {
		
        System.out.println("🔧 Vehicle is under repair in the garage...");
        		
	}
}

	


class Bike implements Vehicle , Garage {

	
	@Override
	public void Start() {
	
		System.out.println("🏍️ Bike started successfully...");
	}

	@Override
	public void Stop() {
		System.out.println("🛑 Bike stopped safely.");
		
	}
	
	public void fuel() {
		System.out.println("⛽ Filling petrol... Done!");
	}
	
	public void repair() {
		System.out.println("🔧 Bike is being repaired in Hero Service Center.....");
	}
	
}

class car implements Vehicle {

	@Override
	public void Start() {
		System.out.println("🚗 Car started successfully...");
	}

	@Override
	public void Stop() {
		System.out.println("🛑 car stopped safely.");
		
		
	}
	
}
