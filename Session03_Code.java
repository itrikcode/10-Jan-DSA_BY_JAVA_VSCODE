import java.rmi.StubNotFoundException;
import java.util.Arrays;

import javax.lang.model.element.Element;

public class Session03_Code {
    public static void main(String[] args) {
        // Q1- insert an element in the array at first posion
        // [1,2,3]
        // [4,1,2,3]
        int a[] = { 1, 2, 3, 4, 3, 2, 12234, 2, 5324 };
        int element = 1;
        int loc = 6;
        System.out.println(Arrays.toString(a));
        // a = insertAtFirst(a, element);
        // a = insertAtLast(a, element);
        // a = insertAtGiveLoc(a, element, loc);

        // Delete elemets from Array
        // a = deleteAtFirst(a);
        // a = deleteAtLast(a);
        a = deleteAtGiveLoc(a, loc);
        System.out.println(Arrays.toString(a));
    }

    public static int[] insertAtFirst(int a[], int element) {
        int b[] = new int[a.length + 1];// size of array 4
        for (int i = 0; i <= a.length - 1; i++) {
            b[i + 1] = a[i];
        }
        b[0] = element;
        return b;
    }

    public static int[] insertAtLast(int a[], int element) {
        int i, b[] = new int[a.length + 1];// increase size of array
        for (i = 0; i <= a.length - 1; i++) {
            b[i] = a[i];

        }
        b[i] = element;
        return b;
    }

    public static int[] insertAtGiveLoc(int a[], int element, int loc) {
        int i, b[] = new int[a.length + 1];

        for (i = 0; i < loc; i++) {
            b[i] = a[i];
        }
        b[loc] = element;
        for (; i < a.length; i++) {
            b[i + 1] = a[i];
        }
        return b;
    }

    // delete at First Elemte
    public static int[] deleteAtFirst(int[] a) {
        int i, b[] = new int[a.length - 1];
        for (i = 0; i < a.length - 1; i++) {
            b[i] = a[i + 1];
        }
        return b;
    }

    // Delete at last Element
    public static int[] deleteAtLast(int[] a) {
        int i, b[] = new int[a.length - 1];
        for (i = 0; i < a.length - 1; i++) {
            b[i] = a[i];
        }
        return b;
    }

    // delete elements give Location
    public static int[] deleteAtGiveLoc(int[] a, int loc) {
        int i, k, b[] = new int[a.length - 1];
        for (i = 0, k = 0; i < a.length; i++) {
            if (i == loc) {
                continue;
            } else
                b[k++] = a[i];
        }

        return b;
    }

}
