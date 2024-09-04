package java_p2;

import java_program.Methods1;

public class Methods3 {

	public static void main(String[] args) {
		// can call public static method in diff package by classname.methodname with import
		Methods1.m1();

		// can call public non static method in diff class by creating object with import
		Methods1 obj = new Methods1();
		obj.m2();

	}

}
