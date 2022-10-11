package ArrayExamples;

import java.util.Arrays;
import java.util.Random;

public class Examples {

    public static void f(int x) {
        x = 7;
    }

    // function to fill an array of integers
    // with random values between 1 and 10 inclusive
    public static void fill_random(int [] arr) {

        Random rng = new Random();
        rng.setSeed(10);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rng.nextInt(1,11);
        }
    }

    public static void print_array(int [] arr) {
        System.out.print('[');
        for (int i = 0; i < arr.length - 1; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[arr.length - 1]);
        System.out.println(']');
    }

    public static void print_array2(int [] arr) {
        System.out.print('[');

        // enhanced for loop
        for (int v : arr)   // for each value v in the array arr
            System.out.print(v + ", ");
        System.out.println(']');
    }

    // return the sum of the values in the array
    public static int sum(int [] arr) {
        int total = 0;

        for (int v : arr)
            total += v;
        return total;
    }

    public static int sum2(int [] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];

        return sum;
    }

    public static int sum3(int [] arr) {
        int sum = 0;
        int i = 0;

        while (i < arr.length)
            sum += arr[i++];  // very common idiom

        return sum;
    }

    // write a function that returns the average of an array of integers
    public static double avg(int [] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static double median(int [] arr) {
        Arrays.sort(arr);

        if (arr.length % 2 == 0)
            return (arr[arr.length / 2] + arr[arr.length/2 - 1]) / 2.0;
        else
            return arr[arr.length / 2 + 1];
    }

    public static void main(String [] args) {

        int [] nums = {4, 1, 0, 9, 2, 8};
        int [] grades = new int[10];  // allocate space for 10 grades

        System.out.println(nums[2]);
        // System.out.println(nums[-1]);   // index out of range error

        fill_random(grades);
        System.out.println(Arrays.toString(grades));
        print_array(grades);
        print_array2(grades);

        int z = 33;
        f(z);   // when z is passed to x a copy is made
        System.out.println(z);
        System.out.println(sum(grades) == 48);
        System.out.println(sum2(grades) == 48);
        System.out.println(sum3(grades) == 48);
        System.out.println(avg(grades) ==  4.8);
        System.out.println(median(grades) ==  4.5);

    }

}
