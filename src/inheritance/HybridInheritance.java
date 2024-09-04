package inheritance;

class GrandParents1 {

	public void gold() {
		System.out.println("Gold");

	}

	public void land() {
		System.out.println("Land");

	}
}

class Parents extends GrandParents1 {

	public void shares() {
		System.out.println("Shares");

	}
}

class Child1 extends Parents {

	public void house() {
		System.out.println("House");

	}
}

class Parents2 extends GrandParents1 {

	public void car() {
		System.out.println("car");

	}
}

class Child2 extends Parents2 {

	public void shop() {
		System.out.println("Shop");

	}
}

public class HybridInheritance {

	public static void main(String[] args) {

		Child1 c1 = new Child1();
		c1.gold();
		c1.land();
		c1.shares();
		c1.house();
		

		Child2 c2 = new Child2();
		c2.gold();
		c2.land();
		c2.car();
		c2.shop();
	}

}
