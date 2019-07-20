package com.redington.java.arrayEx;

import java.util.Scanner;

public class Student {
	int sum,i,j;
	int[] marks = new int[5];
	String[] name=new String[2];
	public void view() 
	{
		
		Scanner scan = new Scanner(System.in);
		for(i=0;i<2;i++)
		{
			System.out.println("==========================");
			System.out.println("Enter Student Name "+(i+1));
			
			name[i]=scan.next();
			for (j = 0; j < 5; j++) 
			{
			System.out.println("Enter Mark"+(j+1));
			 marks[j]=scan.nextInt();
			}
			sum=0;
			for(j=0;j<5;j++)
			{
				sum=sum+marks[j];
			}
			System.out.println(name[i]+" total :" +sum);
		
			float average=sum/j;
			System.out.println(name[i]+" Average is :"+average);
		}
	}
}
