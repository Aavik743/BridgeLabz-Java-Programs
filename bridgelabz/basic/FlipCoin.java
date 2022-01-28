package com.bridgelabz.basic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			int heads = 0; 
			int tails = 0; 
			int counter = 1;
			double randNum = 0.0; 
			boolean temp = false;
			
			while(!temp)
			{

				System.out.println("How Many Times The Coin Should Flip: ");
				int flips =sc.nextInt();
				if(Utility.isPositive(flips)) 
				{
					System.out.println("Counter \t\t RandomlyFlipped \t\t Heads/Tails"); 
					System.out.println("_________________________________________________________________________\n");
					while(counter <= flips)
					{
						randNum = Utility.randomNumber();
						System.out.println(counter + "\t\t\t" + randNum);

						if(randNum < 0.5)
						{
							heads++;
							System.out.println("\t\t\t\t\t\t\t heads");
						}
						else
						{
							tails++;
							System.out.println("\t\t\t\t\t\t\t tails");
						}
						counter++;
						temp = true;
					}

					System.out.println();
					System.out.println("Number of Heads = " + heads);
					System.out.println("Number of Tails = " + tails);
				}
				else
					System.out.println("Enter a Positive Number");
			}
		}

	}	