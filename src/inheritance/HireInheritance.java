package inheritance;

class Father {
	public void gold() {
		System.out.println("Gold");
	}

	public void land() {
		System.out.println("Land");
	}
}

class Son1 extends Father {
	public void shares() {
		System.out.println("Shares");
	}
}

class Son2 extends Father {
	public void house() {
		System.out.println("House");
	}
}

public class HireInheritance {

	public static void main(String[] args) {
		
       Son1 s1 =  new Son1();
       s1.gold(); s1.land(); s1.shares();
       
       Son2 s2 =  new Son2();
       s2.gold(); s2.land(); s2.house();
       
       Father f = new Father();
       f.gold(); f.land();
	}

}
