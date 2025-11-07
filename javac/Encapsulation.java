package javac;

public class Encapsulation {

	public static void main(String[] args) {

		Bussiness bussiness = new Bussiness();
		
		
		harsh h = new harsh();
		h.set(120);
		h.sset(210);
		h.result();
		
		bussiness.result();
		
	}

}
class Bussiness {
	
	private int a = 55;
	private int  b = 60;
	
	public void  set (int a) {
		this.a = a;
		
		}
	public void sset(int b ) {
		this.b = b;
	}
	
	public void result() {
		System.out.println(a+b);

}
	}	
class harsh extends Bussiness{
	
	
}
		
		
