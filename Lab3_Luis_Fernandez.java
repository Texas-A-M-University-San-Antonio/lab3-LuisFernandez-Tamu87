/**
Name: Luis Fernandez
Date: 09/09/2025
Purpose - in this code I will perfom calculations for compound interest

*/

import java.util.Scanner;

    public class Lab3_Luis_Fernandez
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            double Initial_value, Interest_rate, Final_value;
            int time;

            System.out.print("Please enter initial home value: ");
            Initial_value = input.nextDouble();

            System.out.print("Please enter time (in years): ");
            time = input.nextInt();

            System.out.print("Please enter the interest rate (in percentage): ");
            Interest_rate = input.nextDouble();

            Interest_rate = Interest_rate / 100;

            Final_value = Initial_value * Math.pow(1 + Interest_rate,time);
            
            System.out.println("The Final value of this house is: " + Final_value);
        }
    }