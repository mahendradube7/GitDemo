package java_program;

public class SplitMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Manas Java and Selenium Classes";
		
		String[] arr = a.split(" ");
		
		for (int i=0 ;i<arr.length;i++) {
			
			if (arr[i].length()<=5) {
			System.out.print(arr[i] + " ");
			}
		}
		
		
	}

}
