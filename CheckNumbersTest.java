package com.redington.java.arrayEx;

import java.util.Scanner;

public class CheckNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("CHECKING POSITIVE NEGATIVE ODD EVEN AND ZERO");
System.out.println("============================================");
CheckNumbers c=new CheckNumbers();
int[] numbers=new int[20];
Scanner s=new Scanner(System.in);
System.out.println("Enter n Value \t");
int n=s.nextInt();
for(int i=0;i<n;i++){
	System.out.println("Enter An Element"+(i+1));
	numbers[i]=s.nextInt();
}
c.findType(numbers,n);
c.print();

	}

}
