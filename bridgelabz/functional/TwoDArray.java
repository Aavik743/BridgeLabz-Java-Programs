package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TwoDArray 

{
   public static void main (String args[])
   {
	   Scanner sc = new Scanner (System.in);
	   
	   
	   System.out.println("Enter the number of rows: ");
	   int rows = sc.nextInt();
	   System.out.println("Enter the number of columns: ");
	   int columns = sc.nextInt();
	   int [][] array = new int [rows] [columns];
	   System.out.println("Enter elements for the 2-D array: ");
	   for (int i=0; i<rows; i++)
	   {
		   for (int j=0; j<columns; j++)
		   {
			   System.out.println ("Enter the elements of the array: ");
			   array [i][j] =sc.nextInt();
		   }
	   }
	   
	   System.out.println(" The 2-D array of "+rows+" x "+columns+" is: ");
	   Utility.arrayTwoDimensional(array, rows, columns);
   }
}
