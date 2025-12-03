package array;

public class Float_array2 {

	public static void main(String[] args) {
		
		float [] marks = {33.01f,65.02f,99.34f,45.65f,61.28f};
		
		float num=5.02f;
		
		float sum=0;
		
		boolean flag=false;
		
		for(float elements : marks) {
			if(num==elements) {
				flag=true;
				break;
				}
		}
		
			if(flag) {
				System.out.println("the value is present ");				
			}
				else {
				
					System.out.println("the value is not in the array ");
					
					
					
	}
			for(float elements : marks) {
				sum+=elements;
			}
				
			System.out.println("avarege of marks is : "+sum/marks.length);
}
		
	}


