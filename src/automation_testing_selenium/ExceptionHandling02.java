package automation_testing_selenium;

public class ExceptionHandling02 {

	public static void main(String[] args) {

		try {
			String a = null;
			System.out.println(a.length());
		}

		catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("Rest of the Code...!");
		}
	}

}
