package com.bridgelabz.logical;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the N-th term of the fibonacci series: ");
		int N = sc.nextInt();
		
	    Utility.fibonacci(N);
		
	}

}
