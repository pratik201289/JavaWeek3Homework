package JavaWeek3homework;

import java.util.Arrays;

/*
19. Write a Java program to calculate the average value of array elements.
*/
public class Program_19 {

    public static void main(String[] args) {

        int[] array = new int[]{10, 20, 30, 40, 50, 60,70};
        System.out.println("The Array Value:" + Arrays.toString(array));
        int sum = sum(array, 0);
        int len = array.length;
        double avg = sum / len;
        System.out.println("The Average of Array is: " + avg);
    }

    public static int sum(int[] arr, int index) {
        if (arr.length <= index) {
            return 0;
        }
        return arr[index] + sum(arr, index + 1);

    }
}