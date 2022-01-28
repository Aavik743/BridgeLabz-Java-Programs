package com.bridgelabz.junit;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("\n Temperature Conversion");
		System.out.println("\n\n Enter 1 for Celsius to Fahrenheit");
		System.out.println("\n\n Enter 2 for Fahrenheit to Celsius");
		
		int i = sc.nextInt();
		
		Utility.tempConv(i);
		
	}

}
