package com.bridgelabz.logical;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to check if Prime or not: ");
		int P = sc.nextInt();
		Utility.checkPrime(P);
	}

}
