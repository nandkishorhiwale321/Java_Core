package java_Basic;

public class Ladder2 {

	public static void main(String[] args) {
		int num = -1;
		if (num >= 0 && num < 10) {
			System.out.println("Congratulations your  win BIKE...!");
		}
		else if (num > 10 && num <= 20) {
			System.out.println("ongratulations your  win CAR...!");
		}
		else if (num > 20 && num <= 30) {
			System.out.println("ongratulations your win SMART PHONE...!");
		}
		else if (num > 30 && num <=40) {
			System.out.println("ongratulations your win SMART WATCH...!");
		}
		else {
			System.out.println("Better luck Next Time");
		}
	}

}
