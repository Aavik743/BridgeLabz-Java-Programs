package com.bridgelabz.basic;


import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PowerOfTwo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number less than 31 to print power of 2:  ");
		int number = sc.nextInt();
		int leap = 0;
		if(number > 0 && number < 31)
		{
			for(int i = 0; i <= number; i++)
				leap = Utility.powerOfTwo(number, i);
			if(!Utility.isLeapYear(leap))
				System.out.println("2 ^ "+number+ " = "+leap+ " Is a Leap Year");
			else
				System.out.println("2 ^ "+number+ " = "+leap+ " is not a Leap Year");
				
		}
		
	}

}
