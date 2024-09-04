package java_program;

public class AccessSpecifire2 {

	public static void main(String[] args) {
		// only public, protected & default static variable can access outside the class

		System.out.println(AccessSpecifire1.a + AccessSpecifire1.b + AccessSpecifire1.d);
		
		// only public, protected & default non static variable can access outside the class
		
		AccessSpecifire4 obj2 = new AccessSpecifire4();
		
		System.out.println(obj2.w+obj2.x+obj2.z);
	}

}
