package advance.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 16;
		try {
			next(age);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void validate(int age) throws AgeException {
		if(age < 18)
			throw new AgeException("not valid");
		else
			System.out.println("Welcome");
	}
	
	static void next(int age) throws AgeException {
		validate(age);
	}
}
