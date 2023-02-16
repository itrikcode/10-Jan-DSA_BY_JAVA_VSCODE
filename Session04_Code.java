import java.util.Arrays;

public class Session04_Code {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 9, 7, 2, 3, 4, 2, 5, 2 };
        int element = 2;
        System.out.println(Arrays.toString(arr));
        /// arr = deleteGivenElement(arr, element);
        // arr = deleteAtElementFistAndSecondOcc(arr, element);
        // updateFirstElement(arr, 3, 555);
        // updateFirstOccElement(arr, element, 333);
        // updateAllOcc(arr, element, 333);
        updateSecondOcc(arr, element, 20);
        System.out.println(Arrays.toString(arr));
    }

    // delete given element form array
    public static int[] deleteGivenElement(int[] arr, int element) {
        int b[] = new int[arr.length - 1];
        int index = -1, i, k = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }

        }
        if (index != -1) {
            for (i = 0; i < arr.length; i++) {
                if (i == index) {
                    continue;
                }
                b[k++] = arr[i];
            }
            return b;
        } else {
            return arr;
        }

    }

    // delete an element at first and second occurences form that array
    public static int[] deleteAtElementFistAndSecondOcc(int arr[], int element) {
        int i, k, b[] = new int[arr.length - 1];
        int count = 0;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == element) {

                if (count == 2) {
                    break;
                }
                // arr= deleteAtGiveLoc(arr, count);
                for (i = 0, k = 0; i < arr.length; i++) {
                    count++;
                    if (i == count) {
                        continue;
                    } else {
                        b[k++] = arr[i];
                    }

                }

                return b;
            }
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

    // update fisrt given location element in the array
    public static void updateFirstElement(int a[], int loc, int ele) {
        // [10,11,12,11,14,11,16,11]
        // [222,11,12,11,14,11,16,11]

        a[loc] = ele;

    }

    // update first occurence in give array.
    // [10,11,12,11,14,11,16,11]
    // [10,888,12,11,14,11,16,11]
    public static void updateFirstOccElement(int arr[], int oldData, int newData) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldData) {
                arr[i] = newData;
                break;
            }
        }
    }

    // update all occurence in give array.
    // [10,11,12,11,14,11,16,11]
    // [10,888,12,888,14,888,16,888]

    public static void updateAllOcc(int a[], int oldData, int newData) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == oldData) {
                a[i] = newData;
            }
        }
    }

    // update secode occurence in give array.
    // [10,11,12,11,14,11,16,11]
    // [10,888,12,888,14,11,16,11]
    public static void updateSecondOcc(int a[], int oldData, int newData) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == oldData) {
                a[i] = newData;
                count++;
            }
            if (count == 2) {
                break;
            }
        }
    }

}
