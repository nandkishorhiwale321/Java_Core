package java_Basic;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Numbers from 1 to 10 using for loop :");
		for(int i=1;i<=10;i++) {
			System.out.print(i);
	} 			System.out.println();

		int c = 5;
		if (c==5) {
			System.out.println("\nCheck if number is 5 (using if : ");
			System.out.println(c);
		}
		System.out.println();

		int h = 2;
		if (h%2==0) {
			System.out.println("This is even number :"+ " "+h);
			System.out.println();
		}

		else {
			System.out.println("this is odd number :" + " "+ h);
			System.out.println();
		}
		System.out.println();

		System.out.println("Numbers 1 to 10 using (while loop)");
		int d=1;
		while (d<=5) {
			System.out.print(d);
			
			d++;
			
		}			System.out.println();

		
		
		
		int j =10;
		System.out.println("\nNumbers from 10 to 15 :");
		do {
			System.out.print(j +" ");
			j++;
		}while (j<=15);
		
	
		

	}
}
