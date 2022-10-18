package JavaWeek3homework;

import java.util.Scanner;

/*

10. Write a java program to input any two number and ask user to enter their symbol
 (+, -, /, *)
 find addition, Subtraction, multiplication and division according to their symbol (using if else)*/
public class Program_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int input1 = scanner.nextInt();
        System.out.println("Enter number two: ");
        int input2 = scanner.nextInt();
        System.out.println("Ask user to enter their symbol\n" + " (+, -, /, *) : ");
        String str = scanner.next();
        int result;
        scanner.close();
        switch (str) {

            case "+":
                result = input1 + input2;
                System.out.println("Addition: " + result);
                break;
            case "-":
                result = input1 - input2;
                System.out.println("Subraction: " + result);
                break;
            case "*":
                result = input1 * input2;
                System.out.println("Mutipication: " + result);
                break;
            case "/":
                result = input1 / input2;
                System.out.println("Divison: " + result);
                break;
            default:
                System.out.println("Invalid entry");
        }

    }

}
