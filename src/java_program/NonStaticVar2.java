package java_program;

public class NonStaticVar2 {

	public static void main(String[] args) {
		// can access non static variable in diff class  by creating object
		
		NonStaticVar1 obj2 = new NonStaticVar1();
		System.out.println(obj2.n1+obj2.n2);
	}

}
