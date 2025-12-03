package java_Basic;

public class mixedExample {

	public static void main(String[] args) {
		int choise=45;
		int i=10;
		int j=45;
		switch (choise)   {            // switch case                      
		case 1 :
			if ( i>0 && j>0){
				
				System.out.println("addition :"+(i+j) );
				break;
				
			}
		case 2 :
			if (i > j) {
				System.out.println("Sub :" +(i-j) );
			}
			else {
				System.out.println("Sub :"+(j-i));
				break;
			}
		case 3 :
			for (int a=1; a<=10;a++) {
				System.out.println("multiplication :" + (a*i));
			}
		case 4 :
			int n=5;
			int m=1;
			int fact=55;
			do {
		fact*= m;
		m++; 
			
	    }while(m>=n); 
			System.out.println( fact);
			break;
		case 5 :
			int num=66;
			for (int z=1; z<=10; z++) {
				System.out.println("Div... :" +(num/z));
			
				
			}
			break;
			default :
				System.out.println("Enter valid number......");
		
	}
	

System.out.println(".....END.....");
}
}
