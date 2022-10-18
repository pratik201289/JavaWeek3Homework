package JavaWeek3homework;

/*
11. Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
*/
public class Program_11 {
    static void res(int No) {

        //int n = 100;
        for (int i = 0; i < 100; i++) {
         // lcm of 3 and 5 is 15
            if (i % 15 == 0)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

         int N = 100;
        res(N);

    }
}
