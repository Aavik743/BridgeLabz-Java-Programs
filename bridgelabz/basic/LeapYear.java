package com.bridgelabz.basic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;


public class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Year: ");
		int year = sc.nextInt();
		boolean isChecking = false;
		while(!isChecking)
		{
			if(Utility.countDigits(year) == 4)
			{
				if(Utility.isLeapYear(year)) 
					System.out.println(+year+ " is a Leap Year");
				else
					System.out.println(+year+ " is not a Leap Year");
				isChecking = true;
			}
			else
				System.out.println("You Must Enter a year of 4 digits.");
		}
		
	}

}