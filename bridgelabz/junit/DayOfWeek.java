package com.bridgelabz.junit;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the date: ");
		int d = sc.nextInt();
		System.out.println("Enter the month: ");
		int m = sc.nextInt();
		System.out.println("Enter the year: ");
		int y = sc.nextInt();
		
		System.out.println("The entered date is "+d+"-"+m+"-"+y);
		
		int check = Utility.dayOfWeek(d, m, y);
		System.out.println(check);
		
		switch (check) 
		{
		case 0:
			System.out.println("\t It's Sunday");
			break;
		case 1:
			System.out.println("\t It's Monday");
			break;
		case 2:
			System.out.println("\t It's Tuesday");
			break;
		case 3:
			System.out.println("\t It's Wednesday");
			break;
		case 4:
			System.out.println("\t It's Thursday");
			break;
		case 5:
			System.out.println("\t It's Friday");
			break;
		case 6:
			System.out.println("\t It's Saturday");
			break;
		}
	}

}
