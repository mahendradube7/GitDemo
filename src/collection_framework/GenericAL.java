package collection_framework;

import java.util.ArrayList;

import java.util.Collections;

public class GenericAL {

	public static void main(String[] args) {

		ArrayList<Integer> i = new ArrayList<Integer>();

		i.add(11);
		i.add(66);
		i.add(44);
		i.add(65);
		i.add(99);
		// i.add("M");

		System.out.println(i.get(2));
		System.out.println(i);
		i.set(2, 33);
		System.out.println(i);
		for (int a : i) {
			System.out.print(a + " ");
		}
		System.out.println();
		Collections.sort(i);
		System.out.println("Sorted = " + i);
		Collections.reverse(i);
		System.out.println("Reverse = " + i);

	}

}
