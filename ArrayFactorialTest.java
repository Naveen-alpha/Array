package com.redington.java.arrayEx;

import java.util.Scanner;

public class ArrayFactorialTest {

	public static void main(String[] args) {
		ArrayFactorial a = new ArrayFactorial();
		int[] elements = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter Number" + (i + 1) + " :");
			elements[i] = sc.nextInt();
		}
		int[] result = a.findFactorial(elements);
		System.out.println("============================");
		System.out.println("Element\t Value\t Factorial");
		for (int i = 0; i < n; i++) {
			System.out.println(i + "\t " + elements[i] + "\t " + result[i]);
		}
		System.out.println("============================");
	}

}
