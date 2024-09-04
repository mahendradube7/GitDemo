package operators_practise_programe;

public class Progtram8 {

	public static void main(String[] args) {
		// Write a program to calculate the sum of the digits of a 3-digit number.
		//Number : 132        Output : 6

	int n,sum,first,second,third;
		
		n=458;
		first = n/100;// 4
		n=n%100; // 58
		
		second = n/10; //5
		
		third = n%10; 
		
		
		sum = first+second+third;
		
		System.out.println("1st = " +first);
		System.out.println("2nd = " + second);
		System.out.println("3rd = " + third);
		System.out.println("Sum = " + sum);
	}

}
