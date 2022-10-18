package ArrayExamples;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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

    /*
         reverse the values in the array. Modify the actual array passed.
     */
    public static int [] reverse(int [] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    /*
       Return the value of the largest element in the array
     */
    public static int max(final int [] arr) {
        int curr_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > curr_max)
                curr_max = arr[i];
        return curr_max;
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

    /*
        Return the index of the item in arr. If not found -1
     */
    public static int indexOf(final String [] arr, String item) {

        for (int i = 0; i < arr.length; i++)
            //if (arr[i].equals(item))
            if (arr[i].equals(item))
                return i;
        return -1;
    }

    public static void main(String [] args) {

        String [] names = {"Harry", "Hermione", "Ron", "Draco"};

        Scanner s = new Scanner(System.in);
        String name = s.next();

        System.out.println(indexOf(names, name) == 2);
        System.out.println(indexOf(names, "Dumbledore") == -1);

        int [] nums = {4, 1, 0, 9, 2};  // shorthand for the mess below
        int [] nums2 = new int [] {1,2,3,4,5};

        //reverse(nums);
        // functions that return values can be composed
        System.out.println(Arrays.equals(reverse(nums), new int [] {2,9,0,1,4}));
        System.out.println(max(nums) == 9);

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
