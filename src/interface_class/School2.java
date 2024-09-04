package interface_class;

interface Software {
	public void startDate();

	public void endDate();

	public void fee();
}

interface Software2 {
	public void subject();

}

class School1 implements Software {

	@Override
	public void startDate() {
		System.out.println("June 2nd");

	}

	@Override
	public void endDate() {
		System.out.println("April 28");

	}

	@Override
	public void fee() {
		System.out.println("50000");

	}

	public void sports() {
		System.out.println("Football");

	}

}

public class School2 implements Software , Software2{  //Multiple Inheritance

	@Override
	public void startDate() {
		System.out.println("Aug 2nd");

	}

	@Override
	public void endDate() {
		System.out.println("May 28");

	}

	@Override
	public void fee() {
		System.out.println("80000");

	}
	
	@Override
	public void subject() {
		System.out.println("Commerce, Science, Arts");
	}

	public static void main(String[] args) {

		Software s1 = new School1();
		s1.startDate();
		s1.endDate();
		s1.fee();

		School1 s11 = new School1();
//		s11.startDate();
//		s11.endDate();
//		s11.fee();
		s11.sports();
		
		Software2 ss2 = new School2();
		ss2.subject();

		School2 s2 = new School2();
		s2.startDate();
		s2.endDate();
		s2.fee();

	}

	

}
