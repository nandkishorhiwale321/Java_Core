package array;

public class arr2d {

	public static void main(String[] args) {
		int[][]arr=new int [3][5];
		int counter=1;
		
		for (int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=counter;
				counter++;
			}
		}
for (int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[i].length;j++) {


				
				System.out.print(arr[i][j] +"  ");

	}
			System.out.println();
}
	}
}


