package com.bridgelabz.logical;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be reversed: ");
		int num = sc.nextInt();
		
		Utility.reverseNum(num);
		
		

	}

}
