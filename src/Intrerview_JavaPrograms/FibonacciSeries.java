package Intrerview_JavaPrograms;

public class FibonacciSeries {
	
	//// Function to print N Fibonacci Number
	public void Fibo (int n) {
		
		int num1 = 0; int num2 = 1;
		
		for (int i=0;i<n ; i++) {
			System.out.print(num1 + " ");  // Print the number   --- 0 --1---1 ---2---3
			
			// Swap
			int num3 = num1 + num2 ;   // 1 --- 2 ---3----5
			num1 = num2 ;   // 1 --- 1 ---2 ---3
			num2 = num3; // 1 ---- 2 ---3 ---5
		}
	}

	public static void main(String[] args) {
		
		FibonacciSeries fc = new FibonacciSeries ();
		fc.Fibo(6);

	}

}
