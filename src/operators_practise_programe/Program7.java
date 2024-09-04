package operators_practise_programe;

public class Program7 {

	public static void main(String[] args) {
		// Write a program to calculate the sum of the first and the second last digit of a 5 digit.
		//E.g.- NUMBER : 12345        OUTPUT : 1+4=5
		
		int n,sum,first,second,third,fourth,fifth;
		
		n=45891;
		first = n/10000;// 4
		n=n%10000; // 5891
		
		second = n/1000; //5
		n=n%1000; //891
		
		third = n/100; //8
		n=n%100; //91
		
		fourth= n/10; //9
		fifth = n%10; //1
		
		sum = first + fourth;
		
		System.out.println("1st = " +first);
		System.out.println("2nd = " + second);
		System.out.println("3rd = " + third);
		System.out.println("4th = " + fourth);
		System.out.println("5th = " + fifth);
		System.out.println("Sum = " + sum);
		
		

	}

}
