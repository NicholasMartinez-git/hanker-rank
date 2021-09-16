/* Day 2: Operators */

package com.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        // TODO
        // Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
        // and tax percent (the percentage of the meal price being added as tax) for a meal,
        // find and print the meal's total cost Round the result to the nearest integer.

        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the cost of the meal?");
        double meal_cost = scan.nextDouble();

        System.out.println("What is the tip percent?");
        int tip_percent = scan.nextInt();

        System.out.println("What is the tax percent?");
        int tax_percent = scan.nextInt();
        scan.nextLine(); // handle next line character (enter key)

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        double tip = ((double) tip_percent / 100) * meal_cost;
        double tax = ((double) tax_percent / 100) * meal_cost;;
        double total = meal_cost + tip + tax;

        System.out.println("The meal's total cost is: $" + Math.round(total));
    }
}
