package JavaWeek3homework;

import java.util.Scanner;

/*
2. Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
*/
public class Program_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Year:=");
        int year = scanner.nextInt();
        scanner.close();

        //System.out.println(year%100);
        //System.out.println(year%4);
        //System.out.println(year%400);

        if ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0)) {
            System.out.println("Enter Year is leap year");
        } else {
            System.out.println("Enter Year is not a leap year");
        }

    }
}
