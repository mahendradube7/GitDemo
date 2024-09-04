package polymorphism;

public class CompileTimePoly {

// Method Overloading

	public void openResult(int rollNum) {
		System.out.println("Result open successfully for Roll-No. :- " + rollNum);
	}

	public void openResult(String sName) {
		System.out.println("Result open successfully for Student Name. :- " + sName);
	}

	public static void main(String[] args) {

		CompileTimePoly result = new CompileTimePoly();

		result.openResult(45);
		result.openResult("Rohit");
		result.openResult(18);
		result.openResult("Virat");

	}

}
