package JavaWeek3homework;

import java.util.Scanner;

/*
7. Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
*/
public class Program_7 {

    public void calcsalescomm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales ID:");
        int sid = scanner.nextInt();
        System.out.println("Enter Sellers Name:");
        String sname = scanner.next();
        System.out.println("Enter Sales Amount:");
        double samount = scanner.nextDouble();
        System.out.println("Enter Basic Salary:");
        double basic_sal = scanner.nextDouble();
        scanner.close();
        double commision = 0.00;
        if (samount >= 50000) {
            commision = (basic_sal * 35) / 100.00;
        } else if (samount >= 30000) {
            commision = (basic_sal * 20) / 100.00;
        } else if (samount >= 20000) {
            commision = (basic_sal * 10) / 100.00;
        } else if (samount >= 10000) {
            commision = (basic_sal * 5) / 100.00;
        } else if (samount < 10000) {
            commision = (basic_sal * 2) / 100.00;
        }
        System.out.println("The Seller ID: " + sid);
        System.out.println("The Seller Name: " + sname);
        System.out.println("The Seller Amount: " + samount);
        System.out.println("The Basic Salary: " + basic_sal);
        System.out.println("The Sales Commision: " + commision);

    }

    public static void main(String[] args) {

        Program_7 obj = new Program_7();
        obj.calcsalescomm();

    }

}

