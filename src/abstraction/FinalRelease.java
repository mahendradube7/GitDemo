package abstraction;

abstract class FirstRelease {

	public void classRoom() {
		System.out.println("Class Room Training is Started....!");
	}

	public abstract void online();

	public abstract void corporate();

}

abstract class SecondRelease extends FirstRelease {

	@Override
	public void online() {
		System.out.println("Online Training is Started....!");

	}

	public abstract void corporate();

}

public class FinalRelease extends SecondRelease {
	@Override
	public void corporate() {
		System.out.println("Corporate Training is Started....!");

	}

	public static void main(String[] args) {

		FinalRelease fr = new FinalRelease();
		fr.classRoom();
		fr.online();
		fr.corporate();
		
		

	}

}
