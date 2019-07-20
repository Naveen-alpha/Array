package com.redington.java.arrayEx;

public class ArrayPrime {
	int[] primeNumbers = new int[5];
	int count = 0;

	public void findPrime(int start, int end) {
		for (int i = start; i <= end; i++) {
			boolean b = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b) {
				if (count != primeNumbers.length) {
					primeNumbers[count] = i;
					count++;
				}

			}
		}

	}

	public void printPrime() {
		System.out.println("PRIME NUMBERS IN ARRAY INDEX");
		for (int a = 0; a < 5; a++) {
			if (primeNumbers[a] != 0) {
				System.out.print(" " + primeNumbers[a]);
			}
		}
	}
}
