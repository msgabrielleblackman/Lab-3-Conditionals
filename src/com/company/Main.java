package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); {

			int userNum = 0;
			System.out.print("Please enter an integer ");
			userNum = scan.nextInt();
			String answer = "yes";




		System.out.println("Number\t" + "Squared\t" + "Cubed\t");


		System.out.println("=======\t" + "=======\t" + "=======\t");

            for (int i = 0; i <= userNum; i++)
            {
                System.out.println(i + "\t" + "\t" + (int)Math.pow(i,2) + "\t" + "\t" + (int)Math.pow(i,3));

            }
            {
                System.out.println("Press yes to continue");
                answer = scan.nextLine();
                scan.nextLine();

        }while (answer.equals("yes")) ;

            System.out.print("Please Enter An Integer ");
            userNum = scan.nextInt();

    }
        {
            System.out.print("Bye and Have a Nice Day ");
        }

}}






