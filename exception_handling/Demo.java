package exception_handling;

public class Demo {

	public static void main(String[] args) {
	
		int arr[] = {34,45,64,5,6,8};
		
		try {
		
			
			if(arr.length > 4) {
				throw new IndexOfBound("This own Exception");
			}
			System.out.println("All Ok");
			System.out.println(arr[3]);
		}
		catch(IndexOfBound e) {
			System.out.println("Something" + e.getMessage());
		}
		finally {
			System.out.println("The End is Near....");
		}
				
	}
}
 class IndexOfBound extends Exception{
	 IndexOfBound(String sr){
		 super(sr);
	 }
 }