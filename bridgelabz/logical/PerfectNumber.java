package com.bridgelabz.logical;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PerfectNumber 
{

	public static void main(String[] args) 
	{
		long number, s;
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter the number: ");
		number = sc.nextLong();
		
		s = Utility.isPerfect(number);
		
		if (s==number)
			System.out.println(number+" is a perfect number");
		else
			System.out.println(number+" is not a perfect number");
	}

}
