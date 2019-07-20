package com.redington.java.arrayEx;

import java.util.Scanner;

public class PerfectNumberTest {

	public static void main(String[] args) {
		System.out.println("\tPERFECT NUMBERS");
		System.out.println("=========================");
		int[] numbers = new int[5];
		PerfectNumbers pn = new PerfectNumbers();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter an Element "+i+"\t");
			numbers[i] = sc.nextInt();
		}
		pn.findSumOfFactors(numbers);
		pn.checkPerfectNumber(numbers);

	}

}
