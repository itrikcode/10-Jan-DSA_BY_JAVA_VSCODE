import java.time.chrono.MinguoChronology;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Session02_Code {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 0;
        // print length of string
        for (int k = 0; k <= arr.length - 1; k++) {
            // System.out.println();
            count++;
        }
        System.out.println("Lenght of Array is :: " + count);

        // Q- find 1st max , 2nd max , 1st min and 2nd min posting int the give array
        // link random array
        System.out.println("1st Max :: " + arr[arr.length - 1]);
        System.out.println("2nd Max :: " + arr[arr.length - 2]);
        System.out.println("1st Min :: " + arr[0]);
        System.out.println("2nd Min :: " + arr[2 - 1]);

        // Q-2 serarching Techniq (linear , Binary Serach )
        // find postiong put value then get postion.
        // Scanner scan = new Scanner(System.in);
        /*
         * System.out.print("Liner Serach : Enter Value to get Postion ::: ");
         * int value = scan.nextInt();
         * int index = -1;
         * for (int j = 0; j < arr.length - 1; j++) {
         * if (value == arr[j]) {
         * index = j;
         * break;
         * }
         * }
         * System.out.println(" Liner Serach : Postion of given value is :: " + index);
         */

        // Q -3 Binary Search (first in binary Serach be should perform sorting )
        /*
         * int low = 0;
         * int highe = arr.length - 1;
         * int mid = 0;
         * int arr1[] = { 2, 5, 6, 7, 8 };
         * System.out.print("Binary Serach :Enter Value :: ");
         * int valueToSerach = scan.nextInt();
         * int indexOfBinary = -1;
         * while (low <= highe) {
         * mid = (low + highe) / 2;
         * if (arr1[mid] == valueToSerach) {
         * indexOfBinary = mid;
         * System.out.println("mid :: " + mid);
         * break;
         * } else if (arr1[mid] > valueToSerach) {
         * highe = mid - 1;
         * System.out.println("highe :: " + highe);
         * } else {
         * low = mid + 1;
         * System.out.println("Low " + low);
         * }
         * }
         * System.out.println("Binar Serach :: Posting of given vlaue is " +
         * indexOfBinary);
         */

        // Q-4 Comparering the Array

        int a[] = { 1, 2, 5 };
        int b[] = { 1, 2, 8 };
        int c[] = { 2, 5, 1 };
        int d[] = { 1, 2, 5 };
        // ignore the order then we can sort that array then compare .
        Arrays.sort(b);
        Arrays.sort(c);
        Arrays.sort(d);

        System.out.println("a==b :: " + arraytoEquals(a, b));
        System.out.println("a==c :: " + arraytoEquals(a, c));
        System.out.println("a==d :: " + arraytoEquals(a, d));

    }

    public static Boolean arraytoEquals(int x[], int y[]) {
        for (int i = 0; i <= x.length - 1; i++) {
            if (x[i] != y[i]) {
                return false;
            }
        }
        return true;

    }

}