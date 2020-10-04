package problemSolving;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void main(String[] args) {

        switch (2) {
            case 1:
                reverse("Hi my name is Dhruv");
                break;
            case 2:
                List<Integer> arr1 = new ArrayList(); // 0, 3, 4, 31
                arr1.add(0);
                arr1.add(3);
                arr1.add(4);
                arr1.add(31);
                List<Integer> arr2 = new ArrayList(); // 4, 6, 30
                arr2.add(4);
                arr2.add(6);
                arr2.add(30);
                // Output -  0, 3, 4, 4, 6, 30, 31
                List<Integer> list = mergeArray(arr1, arr2);
                for (int item :
                        list) {
                    System.out.print(item + ", ");
                }
                break;
        }

    }

    // merge two sorted array
    public static List<Integer> mergeArray(List<Integer> array1, List<Integer> array2) {

        if (array1.size() < 0) {
            return array2;
        } else if (array2.size() < 0) {
            return array1;
        }

        List<Integer> newArray = new ArrayList<>();
        int i = 0; // array 1
        int j = 0; // array 2
        int k = 0; // new array

        while (i < array1.size() && j < array2.size()) {
            if (array1.get(i) < array2.get(j)) {
                newArray.add(array1.get(i));
                i++;
                System.out.println();
                System.out.println("Value of i = " + i);
            } else {
                newArray.add(array2.get(j));
                j++;
                System.out.println();
                System.out.println("Value of j = " + j);
            }
        }

        while (i < array1.size()) {
            newArray.add(array1.get(i));
            i++;
        }

        while (j < array2.size()) {
            newArray.add(array2.get(j));
            j++;
        }

        return newArray;
    }

    // revese a string O(n) complexity
    private static void reverse(String value) {
        // char[] senChar = new char[sen.length()];
        char[] senChar = value.toCharArray();

        for (int i = senChar.length - 1; i >= 0; i--) {
            System.out.print(senChar[i]); // O(n)
        }
    }
}
