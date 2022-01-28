package com.bridgelabz.basic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class QuotientRemainder 
{

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println(" Enter a dividend: ");
	   int dividend = sc.nextInt();
	   System.out.println(" Enter a divisor: ");
	   int divisor = sc.nextInt();
	   
	   int quotient = Utility.quotient(dividend, divisor);
	   int remainder = Utility.remainder(dividend, divisor);
	   
	   System.out.println("The quotient is: " +quotient);
	   System.out.println("The remainder is: " +remainder);
	}

}
