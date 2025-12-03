package string_op;

public class StringCompare {

	public static void main(String[] args) {
		String str = "Nand";
		String str2 = "kishor";
		
		str = str + str2;
		
		
	
		StringBuilder sb = new StringBuilder("Nand");
		sb.append("kishor");
		sb.reverse();	
		
		
		StringBuffer sb2 = new StringBuffer("Nand");
		sb2.append("kishor");
		
		sb2.delete(3, 4);
		sb2.insert(3, "d");
		sb.replace(0,10,"hiwale");
		
		
		System.out.println("String:"+str);
		System.out.println("StringBuffer:"+sb2);
		System.out.println("StringBuilder:"+sb);
		
				
				
			
				
				
				
				
		
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
