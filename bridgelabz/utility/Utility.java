package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility 
{
	Scanner sc = new Scanner(System.in);
	
	//Harmonic Number
	
	public static double harmonicValue(double n)
	{
		// compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double val = 0.0;

		for (int i = 1; i <= n; i++) 
		{
		//sum += 1.0 / i;
		val = val + (1.0/i);
		}
	return val;
	}

   // Purpose: Check positive number or not
    
	public static boolean isPositive(int number) 
	{
	   return (number > 0);
	}
	
	
	// Random Numbers
	
	public static double randomNumber() 
	{
		return Math.random();
	}
	
	
	// To count number of Digits in a number
		
	public static int countDigits(int number) {
			// int num =number;
			int count;

			for (count = 0; number != 0;) {
				number = number / 10; // number will be divided with 10 until the result becomes 0
				count++;
			}
			return count;
		}
		
		
	// Leap year
	
	public static boolean isLeapYear(int year) {
		
		boolean leapYear = false;
		if (year % 4 == 0 ) 
		{
			leapYear = true;
			return leapYear;
		}

		else

		{
			leapYear = false;
			return leapYear;
		}

	}

	// Power of Two
		public static int powerOfTwo(int number, int digit) {
			return ((int) Math.pow(2, digit));
		}
		
	// Quotient
		public static int quotient(int a, int b ) {
			return ((int) a / b );
		}
		
	//Remainder
		public static int remainder(int a, int b ) {
			return ((int) a % b );
		}
		
	//Even Or Odd
		public static void isEvenOrOdd(int num)
		{
			String oddEven=(num % 2 == 0)? "Even":"Odd";
			System.out.println(num+" is "+oddEven);
		}
	
	// Vowel or Consonant
		public static void isVowelOrNot(char alphabet)
		{
		 String alpha = (alphabet =='a' ||alphabet =='e' ||alphabet =='i' ||alphabet =='o' ||alphabet =='u')? "vowel":"consonant";
			System.out.println(alphabet+" is "+alpha);
		}

		//Largest of three numbers
		
		    public static void findLargest(int num1,int num2, int num3)
		    {
		       if(num1>=num2)
		          {
		    	   if(num1>=num3)
		    		   System.out.println(num1+" is the largest number");
		    	   else
		    		   System.out.println(num3+" is the largest number");
		          }
		       else
		       	  {
		    
		    	   if(num2>=num3)
		    		   System.out.println(num2+" is the largest number");
		        
		    	   else
		    		   System.out.println(num3+" is the largest number");
		       	  }
		    }
		    
		    // Swapping two numbers
		    
		    public static void swapNumber(int num1, int num2)
		    {
		       int t_num1;
		       
		       
		    	  t_num1 = num1;
		    	   num1 = num2;
		    	   num2 = t_num1;
		    	
		    	System.out.println(num1);
		    	System.out.println(num2);
		    	
		    }
		  
		    
		    //Prime factors
		    public static void checkFactors(int num)
		    	{
		    		int number = num;
		    		ArrayList<Integer> list = new ArrayList<>();
		    		for(int i = 2; i <= num; i++)
		    		{
		    			while(num % i == 0)
		    			{
		    				list.add(i);
		    				num /= i;
		    			}
		    		}

		    		System.out.println("Prime factors of "+number+ " are " + list);

		    	}
		    
		    
		 // TwoDimensional Array Creation
			public static void arrayTwoDimensional(int[][] array, int row, int col) {

				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print(array[i][j] + " ");
					}
					System.out.println();

				}

			}
			
		
			//Triplets
			
			public static List<Integer> triplets(int[] arr, int length) 
			{
				List<Integer> list = new ArrayList<Integer>();
				boolean found = false;
			
				for (int i = 0; i < length-2; i++) 
				{
					for (int j = i+1; j < length-1; j++) 
					{
						for (int k = j+1; k < length; k++) 
						{
							if (arr[i]+arr[j]+arr[k] == 0) 
							{
								System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
								list.add(arr[i]);
								list.add(arr[j]);
								list.add(arr[k]);
								found = true;
							}
						}
						
					}
					
				}
				
				if(!found)
				{
					System.out.print("Not Found");
				}
				System.out.println(list);
				return list;
				
			}
			
			
			// Fibonacci Series
			
			public static void fibonacci(int num)
			{
				 int n1 = 0; int n2 = 1; int n3;
				    
				    System.out.println(" "+n1);
				    System.out.println(" "+n2);
					
					int N = num;
					for (int i = 2; i<num ; i++)
					{
						n3 = n2 + n1;
						n1 = n2;
						n2 = n3;
						
						System.out.println(" "+n3);
					}
			}
			
			
			// Perfect Number
			
			public static long isPerfect(long num)  
			{  
			   
			   long sum=0;  
			
			   for(int i=1; i <= num/2; i++)  
			   {  
				   if(num % i == 0)  
				   {  
			 
					   sum=sum + i;  
				   } 
			   }   
			 
			   return sum;   
			}
		  
			
			//Check Prime
			
			public static void checkPrime(int n)
			{  
			   int i,m=0,flag=0;      
			   m=n/2;      
			   
			   if(n==0||n==1)
				  {  
				   System.out.println(n+" is not prime number");      
				  }
			   else
				  {  
				   for(i=2;i<=m;i++)
				   {      
				    if(n%i==0)
				    {      
				     System.out.println(n+" is not prime number");      
				     flag=1;      
				     break;      
				    }      
				   }      
				   if(flag==0)  { System.out.println(n+" is prime number"); }  
				  }
				}  
			
			//Reverse Number
			
			public static void reverseNum(int num)
			{
			   int reverse = 0;	
				while (num != 0)
				{
					int remainder = num % 10;
					reverse =  (reverse * 10) + remainder;
					num = num/10;
				}
				System.out.println("The reversed number is: "+reverse);
			}
		    
			
			//Coupon Number
			
			public static int coupon(int n) 
			{
				return (int) (Math.random() * n);
			}

			
			// Day Of Week
			
			public static int dayOfWeek(int d, int m, int y)
			{
				int d1; int m1; int y1; int x;
				y1 = y - ((14-m) / 12);
				x = y1 + (y1/4) -(y1/100) + (y1/400);
				m1 = m + 12 * ((14 - m ) / 12) - 2;
				d1 = ((d + x + (31 * m1) / 12)) % 7;
				
				return d1;
			}
			
			//Temperature Conversion
			
			public static void tempConv( int n)
			{
				Scanner sc = new Scanner(System.in);
				
				switch (n)
				{
				   case 1:
					   System.out.println("\n Enter the temperature in celsius: ");
					   double C = sc.nextDouble();
					   double F = (C * (9/5) + 32);
					   System.out.println("\n temperarture in fahreinheit: "+F+" F");
					   break;
					
				   case 2:
					   System.out.println("\n Enter the temperature in fahrenheit: ");
					   double F1 = sc.nextDouble();
					   double C1 = ((F1 - 32) * (5/9));
					   System.out.println("\n temperarture in celsius: "+C1+" C");
					   break;
					   
				}
			}
		    
		    //Monthly Payment
			
			public static void monthlyPayment(Double P, Double Y, Double R)
			{
				double n = 12 * Y;
				double r = R / (12 * 100);
				   
				double payment = (P * r) / (1 - Math.pow((1+r),(-n)));
				   
				System.out.println("Required Monthly Payment is: "+payment);
			}
		    
		    
		    
		    
		    
		    
}
