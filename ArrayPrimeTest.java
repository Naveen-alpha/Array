package com.redington.java.arrayEx;

import java.util.Scanner;

public class ArrayPrimeTest {

	public static void main(String[] args) {
		ArrayPrime ap = new ArrayPrime();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Starting Range\t:");
		int start = scan.nextInt();
		System.out.println("Enter the End Range     \t:");
		int end = scan.nextInt();
		ap.findPrime(start, end);
		ap.printPrime();

	}

}
