package com.bridgelabz.basic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	   	System.out.println("Enter a number: ");
		double n=sc.nextDouble();
    	double result=Utility.harmonicValue(n);
		
		if(n>0)
	 	{
			System.out.println("The Harmonic Value for the number is: "+result);
	 	}
		else
		{
			System.out.println("The number should be greater than zero");
		}
		

	}

}
