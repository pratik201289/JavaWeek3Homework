package JavaWeek3homework;

import java.util.Scanner;

/*9. Same as above program-8 using switch statement.*/
public class Program_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Alphabet Between (A TO F): ");
        String str = scanner.nextLine();
        scanner.close();
        switch (str) {
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Banglore");
                break;
            case "C":
                System.out.println("Cheenai");
                break;
            case "D":
                System.out.println("Dhaka");
                break;
            case "E":
                System.out.println("Ernakulam");
                break;
            case "F":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid entry");
        }

    }
}
