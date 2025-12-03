package oops;

public class Anonymous {
	public static void main (String [] args) {
		
		Metro m = new Station();
		m.SecurityChecking("Security gard");
		m.TicketCounter();
	}

}
abstract class Metro
{
	abstract void  TicketCounter();
	
	abstract int SecurityChecking(String str);
	
}
class Station extends Metro{

	@Override
	void TicketCounter() {
		System.out.println(" here aanand nagar metro station ticket counret");
		
	}

	@Override
	int SecurityChecking(String str) {
		System.out.println(" security checking :"+str);
		return 010;
	}
	
	
}
