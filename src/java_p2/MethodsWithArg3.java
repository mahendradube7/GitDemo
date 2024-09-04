package java_p2;

import java_program.MethodsWithArg;

public class MethodsWithArg3 {

	public static void main(String[] args) {
		// can call public static method in diff package by classname.methodname with
		// import

		MethodsWithArg.multiply(5, 0);
		MethodsWithArg.multiply(7, 6);

		// can call public non static method in diff class by creating object with
		// import

		MethodsWithArg obj3 = new MethodsWithArg();
		obj3.add(7, 0);
		obj3.add(2, 10);

	}

}
