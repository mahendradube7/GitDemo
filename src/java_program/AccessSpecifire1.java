package java_program;

public class AccessSpecifire1 {

	// Creating Static Variable with diff access specifire

	public static int a = 10;
	protected static int b = 20;
	private static int c = 30;
	static int d = 40;

	public static void main(String[] args) {
		// All Access specifire with static variable can access directly in same class

		System.out.println(a + b + c + d);

	}

}
