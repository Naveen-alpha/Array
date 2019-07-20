package com.redington.java.arrayEx;

public class OddEvenArray {

	int[] odd = new int[5];
	int[] even = new int[5];

	public void findOddEven(int[] num) {
		for (int i = 0; i < 5; i++) {
			//int e = 0, o = 0;
			if (num[i] % 2 == 0) {
				even[i] = num[i];
				//e++;
			} else {
				odd[i] = num[i];
				//o++;
			}
		}
	}

	public void printOddEven() {

		System.out.println("ODD NUMBERS");
		for (int i = 0; i < 5; i++) 
		{
			if(odd[i]!=0){
			System.out.println("\t"+odd[i]);
			}
		}
		System.out.println("EVEN NUMBERS");
		for(int i=0;i<5;i++)
		{
			if(even[i]!=0){
				System.out.println("\t"+even[i]);
			}
		}
	}
}
