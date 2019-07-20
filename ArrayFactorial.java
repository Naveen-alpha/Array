package com.redington.java.arrayEx;


public class ArrayFactorial {
	int[] factorial = new int[10];

	public int[] findFactorial(int[] numbers) {

		int j = 0;
		for (int i = 0; i < numbers.length; i++) {
			int fact = 1;

			for (j = 1; j <= numbers[i]; j++) {
				fact = fact * j;
			}
			factorial[i] = fact;
		}
		return factorial;
	}

}
