package java_p2;

import java_program.NonStaticVar1;
import java_program.StaticVariable1;

public class Variable {

	public static void main(String[] args) {
		// Staic variable can access in diff package with classname.variable & import statement req
		System.out.println(StaticVariable1.s1+StaticVariable1.s2);
		
		// can access non static variable in diff package  by creating object  & import statement req
		
		NonStaticVar1 obj3 = new NonStaticVar1();
		System.out.println(obj3.n1 + obj3.n2);

	}

}
