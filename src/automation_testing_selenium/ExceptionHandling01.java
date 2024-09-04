package automation_testing_selenium;

public class ExceptionHandling01 {

	public static void main(String[] args) {

		try {
			int data = 100 / 0;
			
			System.out.println(data);
		}

		catch (Exception e) {
			System.out.println("Cant divide by Zero...!");
		}

		finally {
			System.out.println("Rest of the code.......");
		}
	}

}
