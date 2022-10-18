package JavaWeek3homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
20. Write a Java program to test if an array contains a specific value.
*/
public class Program_20 {


    public void arraycontainvalue() {
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
        String[] nameArray = new String[]{"Pratik", "Prime", "Komal", "Humaria", "Sunil"};

        List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
        List<String> nameList = new ArrayList<>(Arrays.asList(nameArray));

        System.out.println("Integer Array Value: " + Arrays.toString(intArray));
        System.out.println(intList.contains(1));
        System.out.println("String Array Value: " + Arrays.toString(nameArray));
        System.out.println(nameList.contains("Pratik"));
    }

    public static void main(String[] args) {
        Program_20 obj = new Program_20();
        obj.arraycontainvalue();
    }
}
