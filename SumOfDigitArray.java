package com.redington.java.arrayEx;

import java.util.Scanner;

public class SumOfDigitArray {
	int[] sumAr = new int[5];
	int[] rem = new int[5];
	int[] copy = new int[5];

	public int[] findSumOfDigit(int[] num) {
		for (int i = 0; i < 5; i++) {
			copy[i] = num[i];
		}
		for (int i = 0; i < 5; i++) {
			int sum = 0;
			while (num[i] > 0 || sumAr[i] > 9) {
				if (num[i] == 0) {
					num[i] = sumAr[i];
					sumAr[i] = 0;
				}
				rem[i] = num[i] % 10;
				sumAr[i] = sumAr[i] + rem[i];
				num[i] = num[i] / 10;

			}
			System.out.println("Sum Of Number "+i+" is "+sumAr[i]);
		}
		return num;
	}

	public void checkDivisibility() {
		for (int i = 0; i < 5; i++) {
			if (copy[i] % sumAr[i] == 0) {
				System.out.println(copy[i]+"     Divisible By    \t"+sumAr[i]);
			} else {
				System.out.println(copy[i]+" is Not Divisible By \t"+sumAr[i]);
			}
		}

	}
}
