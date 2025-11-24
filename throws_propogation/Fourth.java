package throws_propogation;   


/** recursion + throws propagation + exception hadling
 * 
 * 
 */

public class Fourth {
	public static void main(String[] args) {

		Recursion r = new Recursion();
		try {
			r.M3();
		} catch (Exception er) {
			System.out.println(er.getMessage());
		}

	}

}

class Recursion {

	void M1(int count) throws Exception {

		if (count == 0) {
			// Throwing exception when countdown ends
			throw new Exception("Countdown finished...!");
		}
		System.out.println("Count:" + count);

		M1(count - 1);
	}

//	method2 calls method1 and propagates exception
	void M2() throws Exception {

		M1(6);
	}

	// method3 calls Method2 and propagates exception
	void M3() throws Exception {
		M2();
	}

}
