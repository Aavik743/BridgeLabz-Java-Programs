package com.bridgelabz.basic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LargestNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		   int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		   int num2 = sc.nextInt();
		System.out.println("Enter the third number: ");
		   int num3 = sc.nextInt();
		   
		   Utility.findLargest(num1, num2, num3);
	}

}
