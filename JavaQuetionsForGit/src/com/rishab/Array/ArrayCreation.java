package com.rishab.Array;

import java.util.ArrayList;

public class ArrayCreation {

	public static void main(String[] args) {

		// ways to create an array
		// Using Square Brackets:
		int[] numbers = new int[5]; // Creates an array of 5 integers
		String[] names = new String[10]; // Creates an array of 10 strings
		double[] values = new double[3]; // Creates an array of 3 doubles
		// =====================================================================================================

		// Initializing with Values:
		int[] numbers1 = { 1, 2, 3, 4, 5 }; // Creates and initializes an array with values
		String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		// =====================================================================================================

		// Using the new Keyword:
		int[] numbers2 = new int[5]; // Creates an array of 5 integers
		// =====================================================================================================

		// Dynamic Arrays with ArrayList:
		ArrayList<Integer> dynamicArray = new ArrayList<>(); // Creates an empty ArrayList
		dynamicArray.add(10); // Adds elements dynamically
		dynamicArray.add(20);
		// =====================================================================================================

		// Multidimensional Arrays:
		int[][] matrix = new int[3][3]; // Creates a 3x3 matrix (2D array)
		// =====================================================================================================

		// Initializing Multidimensional Arrays:
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Initializes a 3x3 matrix
		// =====================================================================================================

		// Anonymous Array:
		int[] tempArray = new int[] { 10, 20, 30 }; // Anonymous array
		// =====================================================================================================

		// Creating an Array of Objects:
		MyClass[] objectsArray = new MyClass[5]; // Creates an array of MyClass objects
		objectsArray[0] = new MyClass(1, "Object 1");
		objectsArray[1] = new MyClass(2, "Object 2");
		objectsArray[2] = new MyClass(3, "Object 3");
		for (MyClass obj : objectsArray) {
			System.out.println(obj);
		}

	}

	public static class MyClass {
		private int id;
		private String name;

		// Constructor
		public MyClass(int id, String name) {
			this.id = id;
			this.name = name;
		}

		// Getters and setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		// toString method to print object details
		@Override
		public String toString() {
			return "MyClass{" + "id=" + id + ", name='" + name + '\'' + '}';
		}
	}

}
