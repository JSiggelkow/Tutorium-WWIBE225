package prog2.tut1.exception;

public class Auweia {

	public static void main(String[] args) {
		try {
			methodC();
		} catch (ExampleException e ) {
			System.out.println(e.getMessage() + " caught!");
		}
	}

	public static void methodA() throws ExampleException {
		throw new ExampleException("Exception raised by MethodA");
	}

	public static void methodB() throws ExampleException {
		methodA();
	}

	public static void methodC() throws ExampleException {
		methodB();
	}
}
