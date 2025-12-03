package oops;

public class Anonymous_Abstract2 {
	public static void main(String []args ) {
		
		Application App = new Application() {

			@Override
			void TurnOn() {
				System.out.println("Fan is Running");
			}

			@Override
			int PowerCosumpation(int hours) {
				System.out.println("power Cosumed in 5 hours :"+hours+" watts");
				return 250;
			}
			
			
			
		};
		
		App.CompanyName();
		App.TurnOn();
		App.PowerCosumpation(250);
		
	}

}
abstract class Application {
	
	abstract void TurnOn();
	
	abstract int PowerCosumpation(int hourse);
	
    void CompanyName() {
    	
	System.out.println("Company Name : LG");
		
	}
}
