package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ALClass {

	public static void main(String[] args) {

		List al = new ArrayList();

		al.add("Mahendra");
		al.add("798");
		al.add("Skill");
		al.add("2.9");
		al.add("c");

		System.out.println(al);

		al.add("It");
		System.out.println(al);

		al.remove(2);
		System.out.println(al);
		al.add("");
		
		al.add("Mahendra");
		System.out.println(al);
		
		System.out.println(al.get(4));

	}

}
