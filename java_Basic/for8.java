package java_Basic;

public class for8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for (int i=1; i<=100;i++) {
		for (int n = 1; n <= 10; n++) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;    // fact = fact * i
            }
            System.out.println(n + "! = " + fact);

}
	}

}
