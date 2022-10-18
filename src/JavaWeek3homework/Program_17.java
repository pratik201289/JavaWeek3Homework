package JavaWeek3homework;

import java.util.Arrays;

/*
17. Write a Java program to sort a numeric array and a string array.
* */
public class Program_17 {

    public void sortnumericarray()
    {
        int [] sortnum= {56,12,45,67,98,78,19,2,4};

        System.out.println("Original Numeric Array: "+ Arrays.toString(sortnum));
        Arrays.sort(sortnum);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(sortnum));

    }
    public void sortstringarray()
    {
        String[] sortstr = {"Java", "Python","PHP", "C#", "C Programming", "C++"};

        System.out.println("Original String Array: "+ Arrays.toString(sortstr));
        Arrays.sort(sortstr);
        System.out.println("Sorted String Array: " + Arrays.toString(sortstr));
    }

    public static void main(String[] args) {

        Program_17 obj=new Program_17();
        obj.sortnumericarray();
        obj.sortstringarray();
    }

}
