package JavaWeek3homework;

import java.util.Scanner;

/*
1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
2.*/
public class Program_1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int no=scanner.nextInt();
        scanner.close();

        String res=no%2==0? "This is Even Number" : "This is Odd number";

        System.out.println(res);

    }

}

