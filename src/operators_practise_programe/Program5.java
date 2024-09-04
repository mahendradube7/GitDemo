package operators_practise_programe;

public class Program5 {

	public static void main(String[] args) {
		// Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.
		
		int a =55;
		int b= 70;
		
		boolean Ans = a<50 && a<b ;
		System.out.println(Ans);
		
		//Now solve the above question to check if atleast one of the conditions 'a < 50' or 'a < b' is true.

		boolean Ans2 = a<50 || a<b ;
		System.out.println(Ans2);
	}

}
