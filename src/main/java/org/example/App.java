/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;
public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        double p, rate;
        int years;
        System.out.print("Enter the principal: ");
        p = in.nextDouble();
        System.out.print("Enter the rate of interest: ");
        rate = in.nextDouble();
        System.out.print("Enter the number of years: ");
        years = in.nextInt();

        double amount = p * (1 + (rate*years*0.01));
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth $" + df.format(amount) + ".");

        in.close();
    }
}