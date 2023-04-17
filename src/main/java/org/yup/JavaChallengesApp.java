package org.yup;

import org.yup.Challenges;
public class JavaChallengesApp {

    public static void main(String[] args){

        // create a new instance of the challenges class for use in our application
        Challenges challenges = new Challenges();

        // run the greeting method from our challenges to have it return a string greeting and
        // stores it in the greeting variable we created
        // store the string result of challenges' greeting method as greeting
        String greeting = challenges.greeting("eric", 20);

        // print the greeting to the console
        System.out.println(greeting);

        String greetingWithUserInput = challenges.greetingWithUserInput();
        System.out.println(greetingWithUserInput);

        int sum = challenges.addTwoNumbers();
        System.out.println("Sum: " + sum);

        int difference = challenges.subtractTwoNumbers();
        System.out.println("Difference: " + difference);

        int product = challenges.multiplyTwoNumbers();
        System.out.println("Product: " + product);
    }

}
