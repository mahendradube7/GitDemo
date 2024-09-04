package inheritance;

// Single Level Inheritance
// this & super keyword
class Parentss {
	int a = 20;

	public void land() {
		System.out.println("Land");
	}

}

public class Child extends Parentss {

	int a =30;
	public void gold() {
		System.out.println("Gold");
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {

		Child c = new Child();

		c.land();
		c.gold();

		Parentss p = new Parentss();
		p.land();

	}

}
