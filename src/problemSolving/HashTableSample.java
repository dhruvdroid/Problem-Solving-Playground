package problemSolving;

import java.util.*;

public class HashTableSample {

    public static void main(String[] args) {
        switch (1) {
            case 1:
                // using hash table
                List<Integer> array1 = new ArrayList(); // 2,5,1,2,3,5,1,2,4
                array1.add(8);
                array1.add(5);
                array1.add(1);
                array1.add(9);
                array1.add(3);
                array1.add(7);
                array1.add(2);
                array1.add(2);
                Integer duplicateItems = findDuplicateUsingHashTable(array1);
                System.out.print(duplicateItems);
                break;
            case 2:
                List<Integer> arr1 = new ArrayList(); // 2,5,1,2,3,5,1,2,4
                arr1.add(8);
                arr1.add(5);
                arr1.add(1);
                arr1.add(9);
                arr1.add(3);
                //arr1.add(5);
                //arr1.add(1);
                arr1.add(2);
                arr1.add(2);
//                List<Integer> arr2 = new ArrayList(); // 4, 6, 30
//                arr2.add(4);
//                arr2.add(6);
//                arr2.add(30);
                // Output -  0, 3, 4, 4, 6, 30, 31
                Integer duplicateItem = findDuplicate(arr1);
                System.out.print(duplicateItem);
                break;
        }
    }

    private static Integer findDuplicateUsingHashTable(List<Integer> array1) {
        Hashtable<Integer, Integer> map = new Hashtable();
        int duplicate = -1;
        for (int i = 0; i < array1.size(); i++) { // 0, 1, 2, 3, 4, 5, 6,
            if (map.containsKey(array1.get(i))) {
                return array1.get(i);
            } else {
                map.put(array1.get(i), i);
            }
        }

        return duplicate;
    }

    // brute force with Complexity - O(n^2) or O(n)
    private static Integer findDuplicate(List<Integer> arr1) {
        int selectedValue = -1;
        for (int i = 0; i < arr1.size() - 1; i++) { // 0, 1, 2, 3, 4, 5, 6,
            selectedValue = arr1.get(i);
            System.out.println();
            System.out.println("Selected Value = " + selectedValue);

            for (int j = i + 1; j < arr1.size(); j++) { // 1, 2, 3, 4, 5, 6, 7
                System.out.println();
                System.out.println("Is " + selectedValue + " == " + arr1.get(j));
                if (selectedValue == arr1.get(j)) {
                    System.out.println();
                    System.out.println("It's a match = return " + selectedValue);
                    return selectedValue;
                }
            }
            System.out.println("// end of j loop");
        }
        System.out.println("// end of i loop");
        return selectedValue;
    }
}
