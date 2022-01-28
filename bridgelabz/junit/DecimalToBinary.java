package com.bridgelabz.junit;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the decimal number: ");
		int decimal = sc.nextInt();
		
		int binary[] = new int[1000];
		
		int i=0;
		double dec=0;
		while (decimal != 0)                       //To generate the binary number from the decimal number until decimal is equal to 0
		{
			binary[i] = decimal % 2;               //storing the binary number in an Array
			decimal = decimal/2;
			i++;
		}

		System.out.println(" The binary value is: ");
		for (int j=i-1; j>=0 ; j-- )               //Reverses the Array to get the Binary Number Equivalent to Decimal  number
		{
			System.out.print(" "+binary[j]);
			
		}
		
		System.out.println("\n Decimal number after swapping nibbles: ");
		for(int k = 0; k < binary.length; k++)   //The following loop will check the indexes of the Array and and make them power of two where
			                                     //it finds '1' in the array.
		{
			if(binary[k] == 1);                  //will check the index is 1 or not
		    int d = (int)(Math.pow(2, k));
		    double deci = (decimal + binary[d]);
		    dec = deci;
		}
		
		System.out.println("  "+dec);
		
	}

}
