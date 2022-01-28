package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of t: ");
		double t = sc.nextInt();
		System.out.println("Enter the value of v: ");
		double v = sc.nextInt();
		
		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
	
		System.out.println("The Temperature is : "+t);
		System.out.println("The Wind Speed is: " +v);
		System.out.println("The Wind Chill is: "+w);
	}

}