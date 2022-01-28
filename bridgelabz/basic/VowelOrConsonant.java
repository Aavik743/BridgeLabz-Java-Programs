package com.bridgelabz.basic;


import java.util.Scanner;

import com.bridgelabz.utility.*;

public class VowelOrConsonant
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet: ");
		char alpha = sc.next().charAt(0);
	    Utility.isVowelOrNot(alpha);
	}
	
}



