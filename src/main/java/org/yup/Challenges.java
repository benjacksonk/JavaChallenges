package org.yup;

import java.util.Scanner;

public class Challenges {

    public String greeting(String name, int age){

        if (age >= 21) {
            return "Hello " + name + ", welcome to the party!";
        } else {
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

        //return the result of subtracting number2 from number1;
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

    public int interactiveCalculator(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.print("Enter your selection and press ENTER: ");

        //wait for the user to input an integer and press ENTER,
        //store that integer in userSelection
        int userSelection = scanner.nextInt();

        int result;

        switch (userSelection){
            case 1:
                result = this.addTwoNumbers();
                break;
            case 2:
                result = this.subtractTwoNumbers();
                break;
            case 3:
                result = this.multiplyTwoNumbers();
                break;
            default:
                System.out.println("the user chose nonsense (didn't exist as a choice)");
                return 0;
        }

        return result;
    }

    public String coinFlip(){

        if (Math.random() > 0.5) {
            return "heads";
        }else{
            return "tails";
        }

    }

    public String findTheBiggestNumber(){

        //instantiate a scanner which lets us take input from the user
        Scanner scanner = new Scanner(System.in);

        //ask the user for input
        System.out.print("give me the first number please: ");
        //capture that input and store it in a variable called firstNumber
        int firstNumber = scanner.nextInt();

        //ask the user for input
        System.out.print("give me the second number please: ");
        //capture that input and store it in a variable called secondNumber
        int secondNumber = scanner.nextInt();

        int biggestNumber = Math.max(firstNumber, secondNumber);

        return "The biggest number between " + firstNumber + " and " + secondNumber + " is: " + biggestNumber;

    }

    public String findTheSmallestNumber(){

        //instantiate a scanner which lets us take input from the user
        Scanner scanner = new Scanner(System.in);

        //ask the user for input
        System.out.print("give me the first number please: ");
        //capture that input and store it in a variable called firstNumber
        int firstNumber = scanner.nextInt();

        //ask the user for input
        System.out.print("give me the second number please: ");
        //capture that input and store it in a variable called secondNumber
        int secondNumber = scanner.nextInt();

        int smallestNumber = Math.min(firstNumber, secondNumber);

        return "The smallest number between " + firstNumber + " and " + secondNumber + " is: " + smallestNumber;

    }

    public int findTheDifferenceBetweenTwoNumbers(){

        //instantiate a scanner which lets us take input from the user
        Scanner scanner = new Scanner(System.in);

        //ask the user for input
        System.out.print("give me the first number please: ");
        //capture that input and store it in a variable called firstNumber
        int firstNumber = scanner.nextInt();

        //ask the user for input
        System.out.print("give me the second number please: ");
        //capture that input and store it in a variable called secondNumber
        int secondNumber = scanner.nextInt();

        return Math.abs(firstNumber - secondNumber);
    }

    public String convertToUppercase(){

        //instantiate a scanner which lets us take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("provide a word to convert to all UPPERCASE: ");
        String word = scanner.nextLine();

        return "You provided " + word + ", and we converted it to: " + word.toUpperCase();

    }

    public String convertToLowercase(){

        //instantiate a scanner which lets us take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("provide a word to convert to all LOWERCASE: ");
        String word = scanner.nextLine();

        return "You provided " + word + ", and we converted it to: " + word.toLowerCase();

    }

    public String lengthOfWord(){

        //instantiate a scanner which lets us take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("provide a word to get its length: ");
        String word = scanner.nextLine();

        return word + " has " + word.length() + " characters";

    }

}
