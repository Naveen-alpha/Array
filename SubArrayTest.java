package com.redington.java.arrayEx;

import java.util.Scanner;

public class SubArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\tMAKING SUB ARRAY");
		System.out.println("================================");
		SubArray sa = new SubArray();
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter Element " +i+" :");
			numbers[i] = scan.nextInt();
		}
		System.out.print("Enter Starting Index\t:");
		int start = scan.nextInt();
		System.out.print("Enter End Index     \t:");
		int end = scan.nextInt();
		
		sa.subArray(numbers,start,end);
	}

}
