package JavaWeek3homework;

import java.util.Scanner;

/*
12. Write a program that tells us input value is number or an alphabet or symbol.
*/
public class Program_12 {

    public void calc()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value is number or an alphabet or symbol: ");
        char ch=scanner.next().charAt(0);
        scanner.close();

        if(Character.isAlphabetic(ch)) {
            System.out.println(ch + " is a Alphabet");
        }else if(Character.isDigit(ch)){
            System.out.println(ch + " is a Digit ");
        }else
        {
            System.out.println(ch + " is a Special Character");
        }

    }

    public static void main(String[] args) {

        Program_12 prg=new Program_12();
        prg.calc();

    }

}
