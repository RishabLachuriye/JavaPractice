package com.rishab.Array;

import java.util.Scanner;

public class ArrayBasicQA {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Size of array :");

		int arr[] = new int[sc.nextInt()];
		System.out.println("Please enter the value of the array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements of the Array are :");

		for (int a : arr) {
			System.out.print(" " + a);
		}

		System.out.println();

		int sum = findSum(arr);
		System.out.println("sum : " + sum);

		int max = findMax(arr);
		System.out.println("Maximun : " + max);

		int min = findMin(arr);
		System.out.println("Minimum :" + min);

		System.out.println("GET Index");
		int searchindexof = sc.nextInt();
		int index = findIndex(arr, searchindexof);
		if (index != 0) {
			System.out.println("Index : " + index);
		} else {
			System.out.println("Please Enter the value present in the array");
		}

		System.out.println("GET value : Enter the index");
		int searchValueOf = sc.nextInt();
		int value = findValue(arr, searchValueOf);
		if (value != -1) {
			System.out.println("value: " + value);
		} else {
			System.out.println("Please Enter a valid index");
		}

		double Average = findAverage(arr);
		System.out.println("The Average of the array is : " + Average);

		reverseArray(arr);
		System.out.println("The rever of the array is : ");
		for (int i : arr) {
			System.out.println(" " + i);
		}
		System.out.println();

		boolean result = findIfPalindrome(arr);
		System.out.println("Is the Array Palindrome : " + result);

	}

	static boolean findIfPalindrome(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		if (start < end) {
			if (arr[start] != arr[end]) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}

	static void reverseArray(int arr[]) {
		int[] reverse = new int[arr.length];
		int start = 0;
		int end = arr.length - 1;
		if (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}

	static double findAverage(int arr[]) {
		double Average = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		Average = sum / arr.length;
		return Average;
	}

	static int findValue(int arr[], int seachValueof) {
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == seachValueof) {
				return arr[i];
			}
		}
		return value;
	}

	static int findIndex(int arr[], int searchindexof) {

		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchindexof) {
				return i;
			}
		}
		return index;
	}

	static int findSum(int[] array) {
		int sum = 0;
		for (int a : array) {
			sum += a;
		}
		return sum;
	}

	static int findMax(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static int findMin(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// comment
	// comments
	// c

}
