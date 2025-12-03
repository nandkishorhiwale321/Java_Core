package java_Basic;

public class primenumber2 {

	public static void main(String[] args) {
         for(int i=2;i<=50;i++) {
        	 boolean isprime=true;
        	 for (int k=2;k<i;k++) {
        		 if(i%k==0) {
        			 isprime=false;
        		 }
  
        	 }
        	 if(isprime==true) {
        		 System.out.println(i);
        	 }
        	 
	
}
	}

}
