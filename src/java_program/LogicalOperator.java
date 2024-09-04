package java_program;

public class LogicalOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 30; 
		int c = 20;

		System.out.println(a <= b && a == b); // AND
		System.out.println(a > c || a != c);// OR

		System.out.println(a >= b || a == c && b > c || c >= c);

	}

}