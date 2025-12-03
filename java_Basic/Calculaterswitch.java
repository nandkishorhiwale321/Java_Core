package java_Basic;

public class Calculaterswitch {

	public static void main(String[] args) {
		int num1=25;
		int num2=25;
		char operator = ('%');
		int result;
		switch (operator) {
		case  ('+') :{
			result=num1+num2;
			System.out.println(num1 + "+" + num2 +"=" +result);
			break;
		}
		case ('-') : {
			result=num1-num2;
			System.out.println(num1 + "-" + num2 +"=" +result);
			break;
		}
		case ('*') : {
			result=num1*num2;
			System.out.println(num1 + "*" + num2 +"=" +result);
			break;
		}
		case ('/') : {
			double result1=num1/num2;
			System.out.println(num1 + "/" + num2 +"=" +result1);
			break;
		}
		case ('%') : {
			result=num1%num2;
			System.out.println(num1 + "%" + num2 +"=" +result);
			break;
		}
		default: {
			System.out.println("Enter valid operator.......");
		}
		}
		System.out.println("Thak You....!");
	}
	
}
