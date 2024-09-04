package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HS_Class {

	public static void main(String[] args) {

		Set hs = new HashSet();

		hs.add("Grow");
		hs.add(102);
		hs.add(true);
		hs.add("Skill");
		hs.add(45.45);
		hs.add(102);
		

		System.out.println(hs.size());;
		System.out.println(hs);

	}

}
