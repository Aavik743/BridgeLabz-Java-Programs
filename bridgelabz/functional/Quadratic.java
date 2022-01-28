package com.bridgelabz.functional;

import java.util.Scanner;

public class Quadratic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM TO FIND ROOTS OF AN EQUATION: ");
		System.out.println("Enter Value for 'a': ");
		int a = sc.nextInt();
		System.out.println("Enter Value for 'b': ");
		int b = sc.nextInt();
		System.out.println("Enter Value for 'c': ");
		int c = sc.nextInt();
		
		int delta =( b*b-4*a*c);
		double root1;
		double root2;
		if (delta >= 0 );
	    {
	      root1 = (-b+Math.sqrt(delta))/(2*a);
	      root2 = (-b-Math.sqrt(delta))/(2*a);
	    }
	    
		System.out.println("First root is: "+root1+ " and Second root is: " +root2);

	}

}

 