package javac;

public class Ass_encapsulation {

	public static void main(String[] args) {
bussiness ussiness = new bussiness();
ussiness.set("nand");
ussiness.set("Nandkishor");
		
		
	}

}
class bussiness {
	
	private String name = "Nandkishor";
	
	public void  set (String name) {
		if( name.length()==10) {
			System.out.println("it is "+name);}
		else
			System.out.println("enter valid range of name");
			
		
		
	
	}
		
		

			
			}
