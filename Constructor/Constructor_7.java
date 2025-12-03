package Constructor;

public class Constructor_7 {

	public static void main(String[] args) {
		
		Engine e = new Engine();
		Car c = new Car(e);
		c.drive();

	}

}
class Engine {
	
	public void start() {
		System.out.println("Engine is startred......!");
	}
	
}
class Car {
	
	private Engine engine;
	
	Car(Engine engine){
		this.engine=engine;
	
	}
		
		public void drive() {
			engine.start();
			System.out.println("Car is running ");
		}
		
	}

