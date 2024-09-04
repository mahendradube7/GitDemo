package java_program;

public class AccessSpecifire4 {

	// Creating non Static Variable with diff access specifire
	public int w = 15;
	protected int x = 25;
	private int y = 35;
	int z = 45;

	public static void main(String[] args) {
		// All Access specifire with non static variable can access by creating obj in same class
		AccessSpecifire4 obj = new AccessSpecifire4();
		System.out.println(obj.w + obj.x + obj.y + obj.z);
	}

}
