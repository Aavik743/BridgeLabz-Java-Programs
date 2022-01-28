package com.bridgelabz.logical;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CouponNumber 
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of distinct coupon needed: ");
		int n = sc.nextInt();
		
		int count = 0; // Total coupons generated
		int notSame = 0; //Distinct coupons generated
		
		boolean[] collect = new boolean[n]; //// collect[i] = true if card type i already collected
		
		while (notSame < n )
		{
			int coupon = Utility.coupon(n);
			System.out.println(coupon);
			count++;
			
			if (!collect[coupon]) // To check similar coupon number
			{
				notSame++; 
				collect[coupon]=true;
			}
		}
		
		System.out.println("Total random number of card needed: " +count);
		
	}




}
