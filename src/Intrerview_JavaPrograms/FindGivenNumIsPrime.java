package Intrerview_JavaPrograms;

public class FindGivenNumIsPrime {

	public void isPrime(int n) {
		
		int temp = 0;
		
		for (int i=2; i<n; i++) {
			if (n%i==0) {
				 temp = temp+1;
			}
		}
		
		if (temp==0) {
			System.out.println(n+ " is Prime Number");
		}
		
		else {
			System.out.println(n+ " is not Prime Number");
		}
	}
	public static void main(String[] args) {
		
		FindGivenNumIsPrime obj = new FindGivenNumIsPrime();
		obj.isPrime(14);
	}

}
