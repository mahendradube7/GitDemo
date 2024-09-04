package java_program;

public class NonStaticVar1 {

	public int n1 =100;
	public int n2=40;
	
	public static void main(String[] args) {
		// can access non static variable in sameclass by creating object
		
		
		NonStaticVar1 obj = new NonStaticVar1();
		
		System.out.println(obj.n1+obj.n2);

	}

}
