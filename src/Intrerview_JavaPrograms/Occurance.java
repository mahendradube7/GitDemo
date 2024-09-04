package Intrerview_JavaPrograms;

public class Occurance {

	public static void main(String[] args) {

		String s = "amazonnzzaazza";
		String s1 = "";

		System.out.println("First Index of a is : " + s.indexOf("a"));
		
		for (int i = s.length()-1 ; i>=0;i--) {
			
			s1 = s1 + s.charAt(i);
			
		}
				
	System.out.println("Last Index of a is : " + ((s1.length()-1) - s1.indexOf("a")));
	}

}
