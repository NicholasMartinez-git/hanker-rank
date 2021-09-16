/* Day 3: Intro to Conditional Statements */

package com.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {

        // TODO
//        Given an integer, n, perform the following conditional actions:
//
//        If  is odd, print Weird
//        If  is even and in the inclusive range of 2 to 5, print Not Weird
//        If  is even and in the inclusive range of 6 to 20, print Weird
//        If  is even and greater than 20, print Not Weird
//        Complete the stub code provided in your editor to print whether or not  is weird.


        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = scan.nextInt();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        if (n > 20 && n % 2 == 0) {
            System.out.println("Not Weird");
        } else if (n <= 20 && n >= 6 && n % 2 == 0) {
            System.out.println("Weird");
        } else if (n <= 5 && n >= 2 && n % 2 == 0) {
            System.out.println("Not Weird");
        } else if (n % 2 != 0) {
            System.out.println("Weird");
        }
    }
}
