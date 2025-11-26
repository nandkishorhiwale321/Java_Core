package exception_handling;

public class Sixth {

	public static void main(String[] args) throws NotNULLException, InvalidNameException {

		omaa om = new omaa();
	try {
			om.information("121345678");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		
		}
//
	}
}

class omaa {

	public void information(String str) throws NotNULLException, InvalidNameException {
		// try {
		if (str == null) {

			throw new NotNULLException();
		} else if (str.length() == 10) {
			throw new InvalidNameException();
		}

		else {
			System.out.println("YOU ARE NAME NOT VALID ITS MISS-MACH: " + str);
		}

		// }
		// catch(Exception ex) {
		// System.out.println(ex.getMessage());
		// }
	}
}

class NotNULLException extends Exception {

	public NotNULLException() {
		super("name can not be null:");
	}
}

class InvalidNameException extends Exception {
	public InvalidNameException() {
		super("YOU ARE SUCESSUFULLY LOGIN.....");
	}

}
