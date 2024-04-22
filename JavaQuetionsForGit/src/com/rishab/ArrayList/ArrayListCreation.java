package com.rishab.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using the Default Constructor:
		// You can create an empty ArrayList using the default constructor.

		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();

		// With Initial Capacity:
		// You can specify an initial capacity for the ArrayList.

		ArrayList<Integer> numbers1 = new ArrayList<>(10); // Initial capacity of 10
		ArrayList<String> names1 = new ArrayList<>(20); // Initial capacity of 20

		// Initializing with Elements:
		// You can initialize the ArrayList with elements immediately.

		ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

		// From Existing Collection:
		// You can create an ArrayList from an existing collection or another ArrayList.

		List<Integer> existingList = new ArrayList<>(Arrays.asList(10, 20, 30));
		ArrayList<Integer> numbers3 = new ArrayList<>(existingList);

		// Using Double Brace Initialization (Not Recommended for Large Lists):
		// This approach creates an anonymous inner class for initialization.

		ArrayList<Integer> numbers4 = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
			}
		};

		// Java 9+ Factory Methods:
		// Java 9 introduced factory methods for creating immutable and mutable List
		// instances, including ArrayList.

//		List<Integer> numbers7 = List.of(1, 2, 3); // Immutable List
//		ArrayList<Integer> mutableNumbers = new ArrayList<>(List.of(4, 5, 6)); // Mutable ArrayList

		// Using Stream API (Java 8+):
		// You can use the Stream API to create an ArrayList.

		ArrayList<Integer> numbers5 = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toCollection(ArrayList::new));

		// Cloning an Existing ArrayList:
		// You can create a copy of an existing ArrayList.

		ArrayList<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> clonedList = new ArrayList<>(originalList);

		// By Adding Elements Dynamically:
		// You can create an empty ArrayList and add elements later.

		ArrayList<Integer> numbers6 = new ArrayList<>();
		numbers1.add(10);
		numbers1.add(20);
	}

}
