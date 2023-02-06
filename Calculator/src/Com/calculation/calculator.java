package Com.calculation;

import Com.addition.Addition;
import Com.subtraction.Subtraction;
import Com.multiplication.Multiplication;
import Com.division.Division;

import java.util.Scanner;

public class calculator 
{

	public static void main(String[] args) 
	{
		int choice = 0;
		Scanner input = new Scanner(System.in);
		float n1 , n2;

		System.out.println("\nWelcome to Calculator Project!");

		try
		{
			while(!(choice < 0) && choice <= 5 && !(choice > 5))
			{
				System.out.println("\n1 - Addition");
				System.out.println("\n2 - Subtration");
				System.out.println("\n3 - Multiplication");
				System.out.println("\n4 - Division");
				System.out.println("\n5 - Exit");
				System.out.println("\n Enter your Choice");

				choice = input.nextInt();



				if(choice == 5)
				{
					System.out.println("\nThanks for using");
					System.exit(0);
				}

				System.out.println("\nEnter First value");
				n1 = input.nextFloat();

				System.out.println("\nEnter Second value");
				n2 = input.nextFloat();


				if(choice == 1 )
				{
					System.out.println("Sum " + Addition.addition(n1, n2));
				}

				else if(choice == 2 )
				{
					System.out.println("Subtraction " + Subtraction.subtraction(n1, n2));
				}

				else if(choice == 3 )
				{
					System.out.println("Multiplication " + Multiplication.multiplication(n1, n2));
				}

				else if(choice == 4 )
				{
					System.out.println("Division " + Division.division(n1, n2));
				}

				else
				{
					System.out.println("\n Please Specify the Available Choice");
				}

			}

		}
		catch(Exception ex)
		{
			System.out.println("\nError: " + ex.toString() + " Occured");
		}

	}

}
