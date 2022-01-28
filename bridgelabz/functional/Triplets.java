package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Triplets 
{

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Total number of Array Elements you want to insert: ");
				int totalElements = sc.nextInt();
				
				int [] arr = new int[totalElements];
				System.out.println("Enter " +totalElements+ " Array Elements: ");
				
				for (int i = 0; i < arr.length; i++) 
				{
					arr[i] = sc.nextInt();
				}
				
				System.out.print("Triplets ");
				Utility.triplets(arr, arr.length);
			}
	}


