package oops;

public class Interface {
	public static void main (String [] args) {
		Machine m = new Fan();
		m.start();
		m.stop();
		
	}

}
interface  Machine 
{
	
	void start();
	void stop();
	}

class Fan implements Machine {

	@Override
	public void start()
	{
		System.out.println("The fan is roteting..............");

		
	}

	@Override
	public void stop() {
		System.out.println("The fan is stop.............");
		
	}
	
}
