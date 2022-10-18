package JavaWeek3homework;

import java.util.Arrays;

/*
18. Write a Java program to sum values of an array.*/
public class Program_18 {


    public static void main(String[] args) {

        int[] array = new int[]{10, 20, 30, 40, 50, 60};
        System.out.println("The Array Value:" + Arrays.toString(array));
        System.out.println("The Sum of Array is: " + sum(array, 0));
    }

    public static int sum(int[] arr, int index) {
        if (arr.length <= index) {
            return 0;
        }
        return arr[index] + sum(arr, index + 1);

    }


}
