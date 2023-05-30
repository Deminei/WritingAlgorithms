import java.util.Arrays;
import java.util.Comparator;

public class Counting {
    public static void main(String[] args) {
        String[] arr = {"leeksforgeeks"};
        System.out.println("Original array:");
        printArray(arr);

        lexicographicalSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void lexicographicalSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = countSort(arr[i]);
        }
    }

    public static String countSort(String str) {
        int n = str.length();
        char[] count = new char[26];

        for (int i = 0; i < n; i++) {
            count[str.charAt(i) - 'a']++;
        }

        StringBuilder sortedStr = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i]; j++) {
                sortedStr.append((char) (i + 'a'));
            }
        }

        return sortedStr.toString();
    }

    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
