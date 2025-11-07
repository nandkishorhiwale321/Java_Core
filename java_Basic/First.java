package java_Basic;

public class First {
	public static void main(String[] args) {
		int [] arr  = {10,55,96463,6,65,-31,46};
		int num = Integer.MAX_VALUE;
		int mun = Integer.MIN_VALUE;
		for (int i=0;i< arr.length;i++) {
			if (arr [i] < num) {
				num=arr [i];
				
			}
			for (int j=0;j<arr.length;j++) {
				if (arr [j]>mun) {
					mun=arr[j];
				}
			}
		}
		System.out.println("Lowest" + "=" +num);
		System.out.println("Highest"+ "=" +mun);
	

}
	}
