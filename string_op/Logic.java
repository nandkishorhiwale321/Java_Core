package string_op;

public class Logic {

	public static void main(String[] args) {

		
		demo A = new demo();
		
		A.fix("WELCOME");
		A.fix("NANDKISHOR");
	}

}
class demo{
	public void fix(String str3) {
		String str = str3;
		StringBuffer sb = new StringBuffer();
		
		
		for (int i=0;i<str.length();i++) {
			
			String str2 = null;
			
			 if(str.charAt(i)=='E' ||str.charAt(i)=='O' ||str.charAt(i)=='A' ) {
				
				 StringBuffer sb3 = new StringBuffer();
				 
				 str2 = sb3.append(str.charAt(i)).toString().toLowerCase();
				 
				 sb.append(str2);
			 }
			 else {
				 sb.append(str.charAt(i));			 
			
		}
	}
		System.out.println(sb.toString());
	
}
}
