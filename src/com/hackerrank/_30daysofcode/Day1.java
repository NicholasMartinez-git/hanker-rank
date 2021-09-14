/* Day 1: Data Types */

package com.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read the next full lines of input from stdin and save it to our variables i, d, and s.
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        int userInt = scan.nextInt();
        double userDbl = scan.nextDouble();
        scan.nextLine(); // handle next line character (enter key)
        String userStr = scan.nextLine();


        System.out.println("Sum of " + i + " + " + userInt + " = " + (i + userInt));
        System.out.println("Sum of " + d + " + " + userDbl + " = " + String.format("%.1f", (d + userDbl))); // sum of both doubles (scaled to 1 decimal place)
        System.out.println("Concatenated string: " + s + userStr);

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();
    }
}
