package array;

public class Ssecond {

	public static void main(String[] args) {
		int arr []= {10,30,94,-9,96,77,33,45,-65,26};
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				System.out.print(" Even :" +arr[i]);
				//System.out.println();
			//	System.out.println("*********************");
			}
			 else if(arr[i]%2!=0) {
				System.out.println("*********************");
			//	(i%2!=0);
				System.out.println("Odd :" +arr[i]);
			
			}
			 else if (arr[i]%13==0) {
				System.out.println("*********************");
				System.out.println("Disible by 13 is :" +arr[i]);
				
			 }
		}
	}
}

	


