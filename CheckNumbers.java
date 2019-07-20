package com.redington.java.arrayEx;

public class CheckNumbers {
	int positive=0,negative=0,odd=0,even=0,zero=0;
public void findType(int[] num,int n){
	
	for(int i=0;i<n;i++)
	{
	if(num[i]>0){
		positive++;
	}
	if(num[i]<0){
		negative++;
	}else{
		zero++;
	}
	if(num[i]%2==0){
		even++;
	}else{
		negative++;
	}
	}
}
public void print(){
	System.out.println("Positive Numbers\t"+positive);
	System.out.println("Negative Numbers\t"+negative);
	System.out.println("Odd Numbers     \t"+odd);
	System.out.println("Even Numbers    \t"+even);
	System.out.println("Zero Numbers    \t"+zero);
	
}
}
