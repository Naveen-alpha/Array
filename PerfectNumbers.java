package com.redington.java.arrayEx;

public class PerfectNumbers {
	int sumA[] = new int[5];

	public void findSumOfFactors(int[] num) {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < num[i]; j++) {
				if (num[i] % j == 0) { 
					sumA[i] = sumA[i] + j;
				}
				
			}
			System.out.println("Sum Of Factors-->\t"+sumA[i]);
		}
		//return num;
	}

	public int[] checkPerfectNumber(int[] num) {
		for (int i = 0; i < 5; i++) {
			if (num[i] == sumA[i]) {
				System.out.println(num[i] + " is a PerfectNumber");
			} else {
				System.out.println(num[i] + " is Not a PerfectNumbers");
			}
					
		}
		return num;
	}
}
