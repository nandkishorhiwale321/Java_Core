package string_op;

public class Palindrome {

	public static void main(String[] args) {

		
		
	String str = "madam";
	boolean flag=true;
	
	int start = 0;
	int end = str.length()-1;
	
	
	while(start<end) {
		if(str.charAt(start)!=str.charAt(end)) {
			System.out.println(start + "  ******  "+ end);
			flag=false;
			break;
		}
		   start++;
		   end--;
	}
	
//	System.out.println(flag);
	    if(flag) {
	    	System.out.println("is palindrome");
	    }
	    else {
	    	System.out.println("is not palindrome");
	    }

}
}
