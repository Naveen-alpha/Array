package com.redington.java.arrayEx;

import java.util.Scanner;

public class OddEvenArrayTest {

	public static void main(String[] args) {
		System.out.println("\tODD-EVEN");
		System.out.println("=====================");
		int[] numbers = new int[5];
		OddEvenArray oe = new OddEvenArray();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter an Element\t" + i + ":");
			numbers[i] = sc.nextInt();
		}
		oe.findOddEven(numbers);
		oe.printOddEven();
	}

}

