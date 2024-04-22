package com.rishab.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListCreation {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Orange");
		linkedList.add("pineapple");
		linkedList.add("Bannana");
		
		System.out.println("The elements in the list are :" +linkedList);
		
		System.out.println("The value at index 1 is : " +linkedList.get(1));
		
		System.out.println("Replacing an elements : " +linkedList.set(0, "AppleNew"));
		
		System.out.println("Getting the first elements :" +linkedList.getFirst());
		
		System.out.println("Getting the last elements : "+linkedList.getLast());
		
		boolean contain = linkedList.contains("Orange");
		System.out.println("The Elements Orange is present : " +contain);
		
		boolean empty = linkedList.isEmpty();
		System.out.println("The linked List is empty :" + empty);
		
		System.out.println("The reverse of the list is :");
		Collections.reverse(linkedList);
		System.out.println(linkedList);

		System.out.println("Sorted Array is : ");
		Collections.sort(linkedList);
		System.out.println(linkedList);
		
	}

}
