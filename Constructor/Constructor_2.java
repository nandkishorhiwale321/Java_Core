package Constructor;

public class Constructor_2 {

	public static void main(String[] args) {
		
		jamp obj =new jamp(1f);   //Calls the constructor jamp(float a)
		
                                  // i want to print this output using constructor jumping
	}                             //10 20 30 40 50 60 70 80 90 100

}
 class jamp {
	 
	 jamp(){
		 this(10,66);
		 System.out.println("20");
		 
	 }
	 
	 jamp(int a){
		 this(1.9);                     // Calls jamp(double)
		 
		 System.out.println("40");
		 
	 }
	 
	 jamp(String a){
		 this(11);                         /// Calls jamp(int)
		 System.out.println("50");
		 
	 }
	 jamp(int s,int d){              
		 System.out.println("10");
		 
	 }
	 jamp(double a){
		 this();                          //  Calls default constructor jamp()

		 System.out.println("30");
		 
	 }
	 jamp(double a,int b){
		 this("hh");                     // Calls jamp(double, int)
		 
		 System.out.println("60");
		 
	 }
	jamp(int a,int b,int c){
		this(1.1,34);                           // Calls jamp(double, int)
		 System.out.println("70");   
	 }                                              
	jamp(String a,double g){
		this(1,3,6);                           // Calls jamp(int, int, int)

		System.out.println("80");           
	}
	jamp(float a){
		this(11,3f);                          //Calls jamp(int, float)
         
		System.out.println("100");        		
	}
	jamp(int a, float s){
		this("a",1.1);                        //Calls jamp(String, double)
		System.out.println("90");          
		
	}
}