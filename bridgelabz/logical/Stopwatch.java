package com.bridgelabz.logical;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stopwatch 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 1 to start the stopwatch");
		int a= sc.nextInt();
		
		if (a==1);
		{
		Instant i = Instant.now();
		System.out.println(" Enter 2 to stop the stopwatch");
		int b= sc.nextInt();
		
		if (b==2);
		{
			Instant j = Instant.now();
			
		Duration elapsed = Duration.between(i,j);
		System.out.println(" "+elapsed.getSeconds()+" secs");
		}
			
		}
		
		
	}

}
