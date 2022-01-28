package com.bridgelabz.functional;

import java.util.Scanner;


public class Distance
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Co-ordiantes of X and Y: ");
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			double dist = Math.sqrt(x*x + y*y);
			System.out.println("Distance From "+x+" and "+y+" to origin (0, 0) is: "+dist);
		}

}	


