package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class HM_Class {

	public static void main(String[] args) {
		
		Map hm = new HashMap();
		
		hm.put(1, "Collection");
		hm.put("Of", 2);
		hm.put("Map", "HashMap");
		hm.put(4, 16);
		hm.put(4, 17);
		hm.put("Map2", "HashMap");
		
		
		System.out.println(hm);
		System.out.println(hm.containsKey(11));
		System.out.println(hm.get(1));
		System.out.println(hm.remove(1));
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);

	}

}
