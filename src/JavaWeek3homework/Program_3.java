package JavaWeek3homework;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*3. Write a java program to input student Name, roll No,
and three subjects Math, Science and English marks (marks is between 0 to 100 and
if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and find out total,
percentage and result.If he is pass or fail on basis of percentage (pass>=35) and also give them grade
if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
public class Program_3 {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String sname = s1.nextLine();
        System.out.println("Enter Student Roll No: ");
        int rollno = s1.nextInt();
        System.out.println("Enter Maths Subject Marks: ");
        int mathmarks = s1.nextInt();
        System.out.println("Enter Science Subject Marks: ");
        int scimarks = s1.nextInt();
        System.out.println("Enter Maths Subject Marks: ");
        int engmarks = s1.nextInt();
        s1.close();
        if ((mathmarks > 0 && mathmarks <= 100) && (scimarks > 0 && scimarks <= 100) && (engmarks > 0 && engmarks <= 100)) {
            int total = mathmarks + scimarks + engmarks; // Total
            double percentage = (double) total / 3; // percentage;

            String examGrade = " ";
            String result=" ";
            if ((mathmarks < 35) || (scimarks < 35) || (engmarks < 35))
            {
                result="Fail";
                examGrade="F";
            }
            else {
                result="Pass";
                if (percentage >= 80) {
                    examGrade = "A+";

                } else if (percentage >= 60) {
                    examGrade = "A";

                } else if (percentage >= 50) {
                    examGrade = "B";

                } else if (percentage >= 35) {
                    examGrade = "C";

                } else {
                    examGrade = "F";
                }
            }

            System.out.println("------------------------------------");
            System.out.println("|            MarkSheet              |");
            System.out.println("|---------------------------------- |");
            System.out.println("| Name: " + sname +  "\t\t\t\t\t\t\t|");
            System.out.println("| Roll No: " + rollno +"\t\t\t\t\t\t|");
            System.out.println("|-----------------------------------|");
            System.out.println("| Subjects       :    Marks" + "\t\t|");
            System.out.println("| ----------------------------------|");
            System.out.println("| Maths:            " + mathmarks + "\t\t\t\t|");
            System.out.println("| Science:          " + scimarks + "\t\t\t\t|");
            System.out.println("| English:          " + engmarks + "\t\t\t\t|");
            System.out.println("| ----------------------------------|");
            System.out.println("| Total:            " + total + "\t\t\t\t|");
            System.out.println("| ----------------------------------|");
            df.setRoundingMode(RoundingMode.UP);
            System.out.println("| Percentage: " + df.format(percentage) + "\t\t\t\t\t|");
            System.out.println("| Result: " + result + "\t\t\t\t\t\t|");
            System.out.println("| Grade: " + examGrade  + "\t\t\t\t\t\t\t|");
            System.out.println("|-----------------------------------|");
        } else {
            System.out.println("Invalid Input");
        }


    }

}





