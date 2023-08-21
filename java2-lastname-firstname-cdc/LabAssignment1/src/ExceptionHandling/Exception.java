package ExceptionHandling;

public class Exception {
	public void manipulate() {
		int i=5;
		int result=0;
		try {
			result=i/0;
		}
		catch(ArithmeticException e) {
			System.out.println("cann't divide by zero");
		}
	}
	public static void main(String[] args) {
		Exception abc=new Exception();
		abc.manipulate();
	}

}
