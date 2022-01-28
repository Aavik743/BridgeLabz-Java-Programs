package com.bridgelabz.basic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class EvenOdd 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = sc.nextInt();
		Utility.isEvenOrOdd(num);
	}

}
