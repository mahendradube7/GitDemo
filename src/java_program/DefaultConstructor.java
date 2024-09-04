package java_program;

public class DefaultConstructor {

	// creating constructor without argument
	public DefaultConstructor() {
		System.out.println("This is Default Constructor");
	}

	// creating the method
	public void method1() {
		System.out.println("This is method");
	}

	public static void main(String[] args) {

		DefaultConstructor obj =  new DefaultConstructor();
		
		obj.method1();
	}

}
