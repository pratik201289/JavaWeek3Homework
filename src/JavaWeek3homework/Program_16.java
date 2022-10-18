package JavaWeek3homework;

import java.util.Scanner;

/*
16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
*/
public class Program_16 {

    static int calcmethod(int no) {
        if (no > 0) {
            System.out.println(no + " This number is Positive");
        } else if (no < 0) {
            System.out.println(no + " This number is Negative");
        } else if (no == 0) {
            System.out.println(no + " This number is zero");
        } else {
            System.out.println("Invalid input");
        }
        return no;

    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any Number:");
        int n=scanner.nextInt();
        calcmethod(n);

    }
}
