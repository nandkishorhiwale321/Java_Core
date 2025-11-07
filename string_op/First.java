package string_op;

public class First {

	public static void main(String[] args) {
		
		String str = new String("i am intern in uniuqe skill system");
		String str1 = "        I           AM INTERN IN UNIUQE SKILL SYSTEM";
		
	System.out.println(str.charAt(13));
	System.out.println(str.toUpperCase());
	System.out.println(str.equalsIgnoreCase(str1));
System.out.println(str1.trim());
	System.out.println(str.equals(str));
	System.out.println(str1.length());
	System.out.println(str.intern());
	}
	

}
