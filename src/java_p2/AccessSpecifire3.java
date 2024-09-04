package java_p2;

import java_program.AccessSpecifire1;
import java_program.AccessSpecifire4;

public class AccessSpecifire3 {

	public static void main(String[] args) {
		// Public static variable only can access outside package
		
		System.out.println(AccessSpecifire1.a);
		
		// Public non static variable only can access outside package
		
		AccessSpecifire4 obj3 = new AccessSpecifire4();
		System.out.println(obj3.w);

	}

}
