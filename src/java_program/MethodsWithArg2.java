package java_program;

public class MethodsWithArg2 {

	public static void main(String[] args) {
		// can call public static method in diff class by classname.methodname
		MethodsWithArg.multiply(50, 3);
		MethodsWithArg.multiply(15, 15);

		// can call public non static method in diff class by creating object
		MethodsWithArg obj2 = new MethodsWithArg();
		obj2.add(249, 10);
		obj2.add(15, 43);

	}

}
