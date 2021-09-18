/* Day 4: Class vs. Instance */

package com.hackerrank._30daysofcode.day4;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(-1);
        person1.amIOld();
        person1.yearPasses();
        person1.yearPasses();
        person1.yearPasses();
        person1.amIOld();
        System.out.println("");

        Person person2 = new Person(10);
        person2.amIOld();
        person2.yearPasses();
        person2.yearPasses();
        person2.yearPasses();
        person2.amIOld();
        System.out.println("");

        Person person3 = new Person(16);
        person3.amIOld();
        person3.yearPasses();
        person3.yearPasses();
        person3.yearPasses();
        person3.amIOld();
        System.out.println("");

        Person person4 = new Person(18);
        person4.amIOld();
        person4.yearPasses();
        person4.yearPasses();
        person4.yearPasses();
        person4.amIOld();
    }
}
