package com.redington.java.arrayEx;

import java.util.Scanner;

public class ReverseArray {

	private int[] reverse = new int[10];

	public int[] ReverseOrder(int[] numbers,int n)
	{
		int j = 1;
		for (int i = 0; i < n; i++) {
			reverse[n - j] = numbers[i];
			j++;
		}
		return reverse;
	}

}
