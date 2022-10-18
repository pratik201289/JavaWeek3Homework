package JavaWeek3homework;

import java.util.Scanner;

/*
6. Write a java program to input any number and find out if it’s odd or even
7.*/
public class Program_6 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any No:");
        int no=scanner.nextInt();
        scanner.close();

        if(no%2==0){
            System.out.println("Enter no  is even");
        }
        else {
            System.out.println("Enter no is odd");
        }


    }

}
