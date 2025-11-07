package java_Basic;

public class Switchcase {

	public static void main(String[] args) {
		String day="Wednseday";
		switch (day) {
		case "monday" : {
			System.out.println("Today is " + day);
			break;
		}
		case "Tuesday":{
			System.out.println("Today is" +" " + day);
			break;
		}
		case "Wednseday":{
			System.out.println("Today is Wednseday");
			break;
		}
		case "Thrusday" : {
			System.out.println("Today is Thrusday");
			break;
		}
		case "friday" : {
			System.out.println("Today is Friday");
			break;
		}
		case "Saturday" :{
			System.out.println("Today is Saturday");
			break;
		}
		case "Sunday" :{
			System.out.println("Today is Sunday");
			break;
		}
		default: {
			System.out.println("It's not valid");
		
		}
		
		}
		System.out.println("Have a nice day......!");
	}

}
