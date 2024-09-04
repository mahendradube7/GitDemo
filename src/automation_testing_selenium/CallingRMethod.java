package automation_testing_selenium;

import java.io.IOException;

public class CallingRMethod {

	public static void main(String[] args) throws IOException {

		ReusableMethod m = new ReusableMethod();
		m.launchApp("https://www.facebook.com/");
		m.elementAvailable("email", true);
		m.elementAvailable("pass", false);
		m.elementClickable("email",false);
		m.elementClickable("email",true);
		m.urlContain("tacebook", false);
		m.titleContain("Facebook", true);
		m.screenshot();
		m.closeApp();

	}

}
