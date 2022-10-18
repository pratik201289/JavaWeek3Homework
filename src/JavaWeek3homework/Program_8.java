package JavaWeek3homework;

import java.util.Scanner;

/*
8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 if any other alphabet should be invalid entry*/
public class Program_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Alphabet Between (A TO F): ");
        String s1 = scanner.next();
        //String s2="";
        scanner.close();
        if (s1.startsWith("A")) {
            System.out.println("Ahemdabad");
        } else if (s1.startsWith("B")) {
            System.out.println("Banglore");
        } else if (s1.startsWith("C")) {
            System.out.println("Chennai");
        } else if (s1.startsWith("D")) {
            System.out.println("Dhaka");
        } else if (s1.startsWith("E")) {
            System.out.println("Erumapatti");
        } else if (s1.startsWith("F")) {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid Entry");
        }

    }

}
