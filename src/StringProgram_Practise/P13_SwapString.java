package StringProgram_Practise;

public class P13_SwapString {

	public static void main(String[] args) {
		// 15.Java Program to swap two string variables without using third or temp variable?
		
		String a = "Hellow";
		String b = "World";
		
		System.out.println("String A Before Swapping : " + a);
		System.out.println("String B Before Swapping : " + b);
		
		System.out.println("*******************************************************");
		
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		
		System.out.println("String A After Swapping : " + a);
		System.out.println("String B After Swapping : " +b);
		
				

	}

}
