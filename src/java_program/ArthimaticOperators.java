package java_program;

public class ArthimaticOperators {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 5;
//		int c = 7;
		int i = 10;

		int a = 5;

		int b = 15;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		System.out.println("************************************************************************");
		System.out.println(a-- + ++a + i++ + b + a++ + 40);

		System.out.println(--a + --i + i++ + i--);

		System.out.println(++b + b++ + --i + a--);

		System.out.println(++i + b++ + a++ + --i);

		System.out.println(100 - (a + b + i));

		System.out.println("************************************************************************");

		System.out.println(a-- + ++a + i++ + b + a++ + 40);
		System.out.println(--a + --i + i++ + i--);
		System.out.println(++b + b++ + --i + a--);
		System.out.println(++i + b++ + a++ + --i);
		System.out.println(100- (a+b+i));
	}
}
