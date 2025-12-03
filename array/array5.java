package array;

public class array5 {
	public static void main(String [] args) {
		
		int arr [] = {1,6,6,8,99,44,33,4,9,3,65};
		
		int max =Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		
		for(int n:arr) {
			if(n>max) {
				max=n;
			}else {
				for (int k:arr) {
					if (k<min) {
						min=k;
					}
				}
				
			}
			
		}
		System.out.print("The maximum value is :"+max+"\n");
		System.out.print("The minimum value is :"+min);

		
}
	
}