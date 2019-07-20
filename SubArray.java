package com.redington.java.arrayEx;


public class SubArray {

	public int[] subArray(int[] numbers,int start,int end) {
		System.out.println("======================");
		System.out.println("   SUBARRAY VALUES");
		for (int i = start; i <= end; i++) {
			System.out.println(numbers[i]);
		}
		return numbers;
		
	}
}
