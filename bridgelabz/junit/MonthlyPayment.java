package com.bridgelabz.junit;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the Principal Loan Amount: ");
	   double P = sc.nextDouble();
	   System.out.println("Enter the Number of Years: ");
	   double Y = sc.nextDouble();
	   System.out.println("Enter the Rate of Interest: ");
	   double R = sc.nextDouble();
	   
	   Utility.monthlyPayment(P, Y, R);
	   
	 }

}
