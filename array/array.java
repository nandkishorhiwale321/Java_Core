package array;

public class array {

	public static void main(String[] args) {
		
		int [] arr = new int [6];
		
		arr [0] = 10;
		arr [1] = 20;
		arr [2] = 30;
		arr [3] = 40;
		arr [4] = 50;
		arr [5] = 60;
		
		for (int i=0;  i<arr.length;i++) {
			System.out.println("INDEX"+" "+i  +"=" + arr[i]);
			
		}
		String []name= {"nandkishor","roshan","vijay"};
		System.out.println("name = "+ name [2]);
		
		
		int [] sky = {10,55,66,77,88,99};		
		 int k = 0;
		 int n=0;
		 while(k<sky.length) {
			 n=n+sky[k];
			 k++;
		 }
			System.out.println("sum = "+ n);
			
			int [] numbers = {10,55,66,77,88,99};		
			 int a = 0;
			 while(0<numbers.length) {
				 if(numbers[a] %2==0) {
					 System.out.println("EVEN NUBERS = "+ numbers[a]);
				 }
				 a++;
			 }
			
			

	}

}
