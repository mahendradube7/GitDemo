package inheritance;

//MultiLevel Inheritance

class Grandparentss {
	public void gold() {
		System.out.println("Gold");
	}
}

class Parnt extends Grandparentss {
	public void land() {
		System.out.println("Land");
	}
}

public class Children extends Parnt {

	public void shares() {
		System.out.println("Shares");
	}

	public static void main(String[] args) {

		Children c = new Children();
		c.gold();
		c.land();
		c.shares();

		Parnt p = new Parnt();
		p.gold();
		p.land();

	}

}
