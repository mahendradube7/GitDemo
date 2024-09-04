package collection_framework;

import java.util.HashMap;
import java.util.Iterator;

public class HM_Generic {

	public static void main(String[] args) {

		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		hm2.put(101, "A1");
		hm2.put(102, "B1");
		hm2.put(103, "C1");
		hm2.put(103, "C1");
		hm2.put(103, "C2");
		hm2.put(104, "C2");

		System.out.println(hm2);

	}

}
