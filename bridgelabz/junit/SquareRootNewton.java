package com.bridgelabz.junit;

import java.util.Scanner;

public class SquareRootNewton {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of c: ");
		double c = sc.nextDouble();
		double t = c;
		double e = 2.718;
		
		double w = Math.abs(t - (c/t));
		double epsilon = Math.pow(e, -15);		
		double x = epsilon * t;	
		
		while (w>x);
		{
		double temp_t = (t + (c/t))/2;
		t = temp_t;
		}
	}

}
