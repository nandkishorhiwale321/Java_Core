package oops;

public class Polymorphism_overloading {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.calcu();
		cal.calcu(12,10);
		cal.calcu(17,11.02);
		cal.calcu(10,22,90);
		cal.calcu(10,22,90);
		cal.clacu(null);
		Calculator.calcu(11.02, 550);
		cal.calcu(11.21, 25, 22);
	    cal.calcu(34, 42.3, 46);
	}

}class Calculator{
	public void calcu() {
		System.out.println("method 01= this is class calculator");
	}
	public void calcu(int a,int b) {
		System.out.println("method 02= " + a+b);
		
	}
	public void calcu(int a,int b,int c) {
		System.out.println("method 03= "+a+b+c);
	}
	public void calcu(int a,double b) {
		System.out.println("method 04= "+a+b);
	}
	public void clacu(String a) {
		System.out.println("*******************");
	}
	static void calcu(double a,int b) {
		System.out.println(a*b+"  static method");
		
	}
	protected void calcu(double a, int b,int c) {
		System.out.println(a+b-c+"  This is protected method");
		
	}

	protected void calcu(int a,double b,int c) {
		System.out.println(a+b+c + " This is protected overload method");
	}

		
	}


