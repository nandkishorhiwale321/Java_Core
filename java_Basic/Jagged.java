package java_Basic;

public class Jagged {

	public static void main(String[] args) {
		int [][] arr=new int [4][];
		 arr[0]=new int [2];
		 arr[1]=new int [8];
		 arr[2]=new int [1];
		 arr[3]=new int [8];		
		 
		 int counter=1;
		 int sum =0;
		 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=counter;
			
				sum+=counter;
				counter++;
					
				
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
		//		
			}
			System.out.println();
			
			
		}
		System.out.print("Sum is :"+sum);
		

	}

}
