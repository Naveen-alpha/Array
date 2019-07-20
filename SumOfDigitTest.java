package com.redington.java.arrayEx;

import java.util.Scanner;

public class SumOfDigitTest {

	public static void main(String[] args) {
		System.out.println("\t SUM OF DIGIT ARRAY\t");
		System.out.println("====================================");
		SumOfDigitArray sod = new SumOfDigitArray();
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter an Element\t"+i+" :");
			numbers[i] = sc.nextInt();
		}

		sod.findSumOfDigit(numbers);
		sod.checkDivisibility();
	}

}
