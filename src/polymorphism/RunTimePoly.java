package polymorphism;

// Method Overriding

class Jan {
	public void roi () {
		System.out.println("8.2");
	}
}

class Feb extends Jan {
	public void roi () {
		System.out.println("8.4");
	}
}

class March extends Feb{
	public void roi () {
		System.out.println("8.0");
	}
}

class CurrentMonth extends March{
	public void roi () {
		System.out.println("8.6");
	}
}

public class RunTimePoly extends CurrentMonth {

	public static void main(String[] args) {

		CurrentMonth cr = new CurrentMonth();
		cr.roi();
		
		RunTimePoly currentMonth = new RunTimePoly();
		currentMonth.roi();		
				
		March m = new March();
		m.roi();
		
	}

}
