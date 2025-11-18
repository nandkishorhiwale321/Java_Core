package exception_handling;

public class Second {
	
	public static void main (String [] args) {
		
		int arr [] =new int [5];
		
		arr [0] = 100;
		arr [1] = 201;
		arr [2] = 300;
		arr [3] = 400;
		arr [4] = 500;
		
		//int index = 5;
			
		try {	
			if(arr.length > 4) {
		        throw new IndexNotFoundExceptions("Hii");
			}
			System.out.println(arr[4]);
	}	
		catch(IndexNotFoundExceptions ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("*-*-*-*-* THE END*-*-*-*-*-*");
			
		}
	}
}
	
	class IndexNotFoundExceptions extends Exception 
	{
			public IndexNotFoundExceptions(String str)
		{	
			super(str);
		}
	}
