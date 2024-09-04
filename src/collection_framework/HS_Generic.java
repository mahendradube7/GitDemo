package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HS_Generic {

	public static void main(String[] args) {

		Set<String > hs1 = new HashSet<String>();
		
		hs1.add("XCC");
		hs1.add("DDF");
		hs1.add("JJJ");
		hs1.add("EWR");
		hs1.add("XCC");
		
		for (String data:hs1) {
			System.out.println(data);
		}

	}

}
