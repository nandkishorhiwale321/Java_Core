package array;

public class Service {
	public static void main(String args []) {
		Myservice A = new Myservice(101);
		
	}
}

class  Myservice{
	
	
	//5,4,3,2,1
	
	
	
	public Myservice(int a) {
		this(1.2);
		System.out.print("1");
	}
	public Myservice(double c) {
		this(1.1f);                              
		System.out.println("2");
	}
	public Myservice(float g) {
		this(1,1);
		System.out.println("3");
	}
	public Myservice(int r, int h) {
		this(1f,6);
		System.out.println("4");
	}
	public Myservice(float m,int j) {
	
		System.out.println("5");
		}
	}