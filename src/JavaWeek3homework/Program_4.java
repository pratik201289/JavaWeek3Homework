package JavaWeek3homework;


import java.util.Scanner;

public class Program_4 {

    public static void isLeapYear(int year) {

        int res;
        if (year >= 1 && year <= 9999) {

            res = year % 400 == 0 || year % 100 == 0 || year % 4 == 0 ? 1 : 0;

            switch (res) {

                case 1:
                    System.out.println("\n" + year + " is the leap year.");
                    break;

                case 2:
                    System.out.println("\n" + year + " is not the leap year.");
                    break;

                default:
                    System.out.println("\n" + year + " is not the leap year.");

            }
        } else {
            System.out.println("The parameter is not in the range(1-9999)");
        }
    }

    public static void getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            System.out.println("Enter valid month between 1 to 12");
        } else if (year < 1 || year > 9999) {
            System.out.println("Enter valid year between 1 to 9999");
        } else {
            boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            // Display the number of days in the month
            switch (month) {
                case 1:
                    System.out.println("January " + year + " had 31 days");
                    break;
                case 2:
                    System.out.println("February " + year + " had" + ((leapYear) ? " 29 days" : " 28 days"));
                    break;
                case 3:
                    System.out.println("March " + year + " had 31 days");
                    break;
                case 4:
                    System.out.println("April " + year + " had 30 days");
                    break;
                case 5:
                    System.out.println("May " + year + " had 31 days");
                    break;
                case 6:
                    System.out.println("June " + year + " had 30 days");
                    break;
                case 7:
                    System.out.println("July " + year + " had 31 days");
                    break;
                case 8:
                    System.out.println("August " + year + " had 31 days");
                    break;
                case 9:
                    System.out.println("September " + year + " had 30 days");
                    break;
                case 10:
                    System.out.println("October " + year + " had 31 days");
                    break;
                case 11:
                    System.out.println("November " + year + " had 30 days");
                    break;
                case 12:
                    System.out.println("December " + year + " had 31 days");
                default:
                    System.out.println("Invalid Input");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year Between (1-9999): ");
        int val = scanner.nextInt();
        isLeapYear(val);

        //isLeapYear(-1600);
        //isLeapYear(1600);
        //isLeapYear(2017);
        //isLeapYear(2000);

        System.out.println("Enter Month Here: ");
        int val2 = scanner.nextInt();
        System.out.println("Enter year Here: ");
        int val3 = scanner.nextInt();
        getDaysInMonth(val2, val3);
        scanner.close();
        //getDaysInMonth(1, 2020);
        //getDaysInMonth(2, 2020);
        //getDaysInMonth(2, 2018);
        //getDaysInMonth(-1, 2020);
        //getDaysInMonth(1, -2020);

    }


}
