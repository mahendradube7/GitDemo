package operators_practise_programe;

public class Program9 {

	public static void main(String[] args) {
		// Write a program to reverse a 3-digit number. E.g.-Number : 132        Output : 231
		
		int n,first,second,third,reverse;
		
		n=567;
		
		first = n/100; //5
		n=n%100; //67
		
		second=n/10; //6
		
		third=n%10; //7
		
		reverse= third*100+second*10+first;
		
		System.out.println(reverse);

	}

}
