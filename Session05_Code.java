import java.util.Arrays;

public class Session05_Code {
    public static void main(String[] args) {
        ;
        // printIndexWithChar("sdlfsdlfksjflsdjfs");
        // printEvenIndexChar("vivek");
        // printWoverl("vivek kumar");
        // int countNumber = countString("vivek kuamr ram");
        // System.out.println("NUmber of Char :: " + countNumber);
        // printConsonent("abcdefghijklmnopqrstabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzuvwxyz");
        // sortString("raja");
        sortStringDecending("raja");
    }

    // print index with coressponding charchet
    // welome ----> 0,1,2,3,4,5....
    public static void printIndexWithChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + "========>" + i);
        }
    }

    // print only those indexes which are present in even location
    // raja
    // r===0
    // j===2
    public static void printEvenIndexChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(str.charAt(i) + "======" + i);
            }
        }
    }

    // print only vowel those are present in the String
    // A, E, I, O, U, Y, W
    public static void printWoverl(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
            // str.charAt(i) == 'o'
            // || str.charAt(i) == 'u') {
            // System.out.println(str.charAt(i) + "=========> " + i);
            // }
            if (c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') {
                System.out.println(str.charAt(i));
            }
        }
    }

    // count string and print number
    public static int countString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (str.charAt(i) == ' ') {
                count--;
            }
        }
        return count;
    }

    // print only consonenets
    public static void printConsonent(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
            // str.charAt(i) == 'o'
            // || str.charAt(i) == 'u') {
            // System.out.println(str.charAt(i) + "=========> " + i);
            // }
            if (!(c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u')) {
                System.out.println(str.charAt(i));
            }
        }
    }

    // sort give string based on charecter accending order
    public static void sortString(String str) {
        char c[] = str.toCharArray();
        Arrays.sort(c);
        System.out.println(str);
        String str1 = new String(c);
        System.out.println(str1);
    }

    // sort give string based on charecter decending order
    public static void sortStringDecending(String str) {
        char c[] = str.toCharArray();
        Arrays.sort(c);
        System.out.println(str);
        String str1 = "";
        for (int i = c.length - 1; i >= 0; i--) {
            str1 = str1 + c[i];
        }
        System.out.println(str1);

    }
}
