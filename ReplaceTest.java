package com.redington.java.arrayEx;

import java.util.Scanner;

public class ReplaceTest {

	public static void main(String[] args) {
		System.out.println("FIND AND REPLACE AN ELEMENT");
		System.out.println("===========================");
		Replace r = new Replace();
		int[] numbers = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value :\t  ");
		int n = s.nextInt();
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter an Element "+(i+1));
			numbers[i] = s.nextInt();
		}
		int[] replace = r.makeReplace(numbers, n);
		System.out.println("===================");
		for(int i=0;i<n;i++)
		{
			System.out.println(replace[i]);
		}
	}

}
