package throws_propogation;

public class Third {
	public static void main(String[] args) {
		Login login = new Login();
		try {
			login.M3("ggjjj", "ggghhl");
		} catch (InvalidUserNameAnePasswordException ex) {
			System.out.println(ex.getMessage());
		}

	}
}

class Login {

	void M1(String username, String password) throws InvalidUserNameAnePasswordException {

		if (!username.equals("NandaCoder") || password.equals("nanda3333")) {
			throw new InvalidUserNameAnePasswordException("Invalid User name And Password...❌");
		}
		System.out.println("You are sucessfully logging...✅");

	}

	void M2(String u, String p) throws InvalidUserNameAnePasswordException {
		M1(u, p);
	}

	void M3(String u, String p) throws InvalidUserNameAnePasswordException {
		M2(u, p);
	}
}

class InvalidUserNameAnePasswordException extends Exception {
	public InvalidUserNameAnePasswordException(String str) {
		super(str);
	}
}