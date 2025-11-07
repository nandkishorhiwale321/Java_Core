package array;

public class Float_array {

	public static void main(String[] args) {
		float [] marks = {33.01f,65.02f,99.34f,45.65f,61.28f};
		float sum=0;
		for(float elements : marks) {
			sum=sum+elements;
		}
		System.out.println("sum of total marks is :"+ sum);
	
	for(float elements : marks) {
		sum=sum-elements;
		System.out.println("    ");
		}
	System.out.println("sub :"+sum);
	}

}
