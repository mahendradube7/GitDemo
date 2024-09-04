package java_program;

public class Students {

	int a;
	int b;
	int c;

	public Students(int m1, int m2) {
		a = m1;
		b = m2;

	}

	public Students(int m1, int m2, int m3) {
		a = m1;
		b = m2;
		c = m3;
	}

	public void total() {
		System.out.println(a + b);
	}

	public void percentage() {
		System.out.println((a + b) / 2);
	}

	public void total1() {
		System.out.println(a + b + c);
	}

	public void percentage1() {
		System.out.println((a + b + c) / 3);
	}

	public static void main(String[] args) {

		Students c1 = new Students(15, 45);
		c1.total();
		c1.percentage();
		
		Students c2 = new Students(85, 95);
		c2.total();
		c2.percentage();
		
		Students c3 = new Students(75, 65, 63);
		c3.total1();
		c3.percentage1();
		
		Students c4 = new Students(95, 97, 93);
		c4.total1();
		c4.percentage1();
		
		
	}

}
