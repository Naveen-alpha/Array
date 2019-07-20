package com.redington.java.arrayEx;

import java.util.Scanner;

public class AscDesOrderTest {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		int[] asc = new int[5];
		int[] des = new int[5];
		AscDesOrder ad = new AscDesOrder();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter an Element");
			numbers[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			asc[i] = numbers[i];
			des[i] = numbers[i];
		}
		int[] ass = ad.doAscOrder(asc);
		int[] dss = ad.doDesOrder(des);
		System.out.println("ASCENDING ORDER");
		for (int i = 0; i < 5; i++) {
			System.out.print(ass[i] + " ");
		}
		System.out.println("\n DESCENDING ORDER");
		for (int i = 0; i < 5; i++) {
			System.out.print(dss[i] + " ");
		}
	}

}
