package com.rishab.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListBasicQA {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("The ArrayList elements are : " + list);

		System.out.println("The element at index 1 is : " + list.get(1));

		System.out.println("setting the value of index 2 to 60 " + list.set(2, 60));

		System.out.println("The element after that are " + list);

		System.out.println("Removing an elements from the list of perticular index " + list.remove(4));

		System.out.println("The elements after removal are " + list);

		boolean containsElement = list.contains(60);
		System.out.println("The elements contains " + containsElement);
		
		System.out.println("Reversing the elements ");
		Collections.reverse(list);
		
		boolean emptyElement = list.isEmpty();
		System.out.println("The List is empty : "+emptyElement);
		
		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Orange","Bannana"));
		System.out.println("The elements of fruit are : " +fruits);

	}
}
