package JavaWeek3homework;

import java.util.Scanner;

/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10% DA = Basic salary 8%
TA = Basic salary 9% PF= Basic salary
20% Gross
salary = basic salary + HRA + TA + DA –PF
*/
public class Program_5 {

    public void findgrosssal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Id:");
        int empid = scanner.nextInt();
        System.out.println("Enter Employee Name:");
        String ename = scanner.next();
        System.out.println("Enter Basic Salary:");
        double sal = scanner.nextDouble();

        double grosssal, hra, da, ta, pf;
        grosssal=0.00;
        hra = (sal * 10) / 100;
        da = (sal * 8) / 100;
        ta = (sal * 9) / 100;
        pf = (sal * 20) / 100;

       grosssal = (sal + hra + ta + da - pf);
      //  System.out.println("gross sal:" + grosssal);

        System.out.println("_______________________________ | ");
        System.out.println("|         Salary Slip           | ");
        System.out.println("|------------------------------| ");
        System.out.println("|Employee ID            : "+empid +"\t|");
        System.out.println("|Employee Name          : "+ename + "|");
        System.out.println("|-------------------------------|");
        System.out.println("|HRA 10%                :" +hra +"\t|");
        System.out.println("|TA  8%                 :" +ta  +"\t|");
        System.out.println("|DA  9%                 :" +da  +"\t|");
        System.out.println("|PF -20&                :" +pf  +"\t|");
        System.out.println("|------------------------------|");
        System.out.println("|Gross Salary           :"+grosssal +"|\t");
        System.out.println("|------------------------------|");

    }

    public static void main(String[] args) {

        Program_5 obj = new Program_5();
        obj.findgrosssal();

    }

}

