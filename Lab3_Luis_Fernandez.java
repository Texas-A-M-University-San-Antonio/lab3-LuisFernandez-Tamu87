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
            Scanner input = new Scanner(System.in);      ///

            double Initial_value, Interest_rate, Final_value;             ///declare double variables for the value, interest rate, time, and final value after the interest is applied to the initial value.
            int time;

            System.out.print("Please enter initial home value: ");
            Initial_value = input.nextDouble();

            System.out.print("Please enter time (in years): ");      ///from lines 19 to 26 the code asks the user to input the information required for this calculation and the units it'll use in this code
            time = input.nextInt();

            System.out.print("Please enter the interest rate (in percentage): ");           
            Interest_rate = input.nextDouble();

            Interest_rate = Interest_rate / 100;            ///this variable makes the interest rate from a percentage to a decimal

            Final_value = Initial_value * Math.pow(1 + Interest_rate,time);       ///this is going to do the calculation using the formula for compund interest  
            
            System.out.println("The Final value of this house is: " + Final_value);   ///this displays the result of the calculation
        }
    }