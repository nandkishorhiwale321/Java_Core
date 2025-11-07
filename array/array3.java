package array;

public class array3 {

	public static void main(String[] args) {

		int [] [] num= {{1,2,3},{4,5,6}};
		int [] [] num2= {{5,2,6},{3,8,8}};
		int [] [] num3= {{0,0,0},{0,0,0}};
		for (int i=0;i<num.length;i++) {
			for (int j=0;j<num[i].length;j++) {
				num3[i][j]=num[i][j]+num2[i][j];
			}
			
		}
		for (int i=0;i<3;i++) {
			for (int j=0;j<num[i].length;j++) {
				System.out.print(num3[i][j]+" ");
				//num3[i][j]=num[i][j]+num2[i][j];
	}System.out.println();
		}
	}}
