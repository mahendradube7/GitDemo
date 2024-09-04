package java_program;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = " Manas QA ";
		String b = "Grow Skill IT";
		
		if (a.length()== 7 && b.contains("123")) {
			
			System.out.println("Condition is True");
		}
		else
			System.out.println("Condition is false");

		System.out.println(a.concat(b));
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("n "));
		System.out.println(a);
		System.out.println(a.trim());
		
		System.out.println(b.replace("l", "m"));
		System.out.println(a.replace(" Manas", "Mahendra"));
		
		
	}

	
}
