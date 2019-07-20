package com.redington.java.arrayEx;

import java.util.Scanner;

public class PositiveOrNot {
	int number[] = new int[5];

	void getInput() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter Number" + i+" ");
			number[i] = sc.nextInt();
		}
	}
	void findSign(){
		for(int i=0;i<5;i++){
			if(number[i]>0){
				System.out.println("Index "+i+" Value "+number[i]+" is Positive");
			}else if(number[i]<0){
				System.out.println("Index "+i+" Value "+number[i]+" is Negative");
			}else{
				System.out.println("You entered O");
			}
				
		}
	}
}
