package com.redington.java.arrayEx;

import java.util.Scanner;

public class Replace {

	public int[] makeReplace(int[] num,int n) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Find an Specific Element");
		int find=scan.nextInt();
		System.out.println("Enter any Value to Replace " );
		int repl=scan.nextInt();
		int count=0;
		int check=0;
		for(int i=0;i<n;i++)
		{	
			if(num[i]==find){
				num[i]=repl;
				count++;
				check=1;
			}
		}
		if(check==0){
			System.out.println("This Element Not Found.Enter any other Element ");
		}
		System.out.println("Element found "+count+" times");
		return num;
	}
}
