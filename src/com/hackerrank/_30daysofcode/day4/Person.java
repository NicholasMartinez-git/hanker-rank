/* Day 4: Class vs. Instance */

package com.hackerrank._30daysofcode.day4;

public class Person {

    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void yearPasses() {
        this.age += 1;
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}