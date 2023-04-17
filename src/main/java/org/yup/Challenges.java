package org.yup;

import java.util.Scanner;

public class Challenges {

    public String greeting(String name, int age){

        if (age >= 21) {
            return "Hello " + name + ", welcome to the party!";
        }else{
            return "Hello " + name + ", I am sorry but we cannot let you into the party.";
        }

    }

    public String greetingWithUserInput(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 21) {
            return "Hello " + name + ", welcome to the party!";
        }else{
            return "Hello " + name + ", I am sorry but we cannot let you into the party.";
        }

    }

    public int addTwoNumbers(){

        Scanner scanner = new Scanner(System.in);

        //ask the user for number1
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        //ask the user for number2
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        //return the sum of number1 and number2
        return number1 + number2;

    }

    public int subtractTwoNumbers(){

        Scanner scanner = new Scanner(System.in);

        //ask the user for number1
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        //ask the user for number2
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        //return the difference of number1 and number2
        return number1 - number2;

    }

    public int multiplyTwoNumbers(){

        Scanner scanner = new Scanner(System.in);

        //ask the user for number1
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        //ask the user for number2
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        //return the product of number1 and number2
        return number1 * number2;

    }
}
