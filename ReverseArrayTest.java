package com.redington.java.arrayEx;

import java.util.Scanner;

public class ReverseArrayTest {

	public static void main(String[] args) {
		System.out.println("REVERSING THE ARRAY");
		System.out.println("==================");
		int[] numbers = new int[10];
		ReverseArray re = new ReverseArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter an Element");
			numbers[i] = sc.nextInt();
		}
		int[] result = re.ReverseOrder(numbers, n);
		System.out.println("============");
		System.out.println("Numbers\t ReverseOrder");
		for (int i = 0; i < n; i++) {
			System.out.println(numbers[i] + "\t" + result[i]);
		}
	}

}
