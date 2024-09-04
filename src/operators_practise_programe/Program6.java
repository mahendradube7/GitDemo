package operators_practise_programe;

public class Program6 {

	public static void main(String[] args) {
		//Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
		
		
		//( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)

		////1 - first program by using a third variable
		int a = 6;
		int b= 8;
		
		//using 3rd variable
		
		int c = 6;
		
		a=c;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
		//2 - second program without using any third variable
		
		b=b-a; //-2
		a=b+a; // -2+8=6
		b=-(b-a); // -(-2-6) = 8
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
