package java_program;

public class ParseKeyword {

	public static void main(String[] args) {
		
		String s ="200";
		
		System.out.println(s+100);
		
		int i = Integer.parseInt(s);
		System.out.println(i+100);
		
		float f = Float.parseFloat(s);
		System.out.println(f+50);

		double d = Double.parseDouble(s);
		System.out.println(d+25);
	}
}
