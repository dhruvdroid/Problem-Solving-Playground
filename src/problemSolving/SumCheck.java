package problemSolving;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class SumCheck {


    public static void main(String[] args) {

        int arr[] = new int[6];
        arr[0] = 6;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;
        arr[5] = 7;
        System.out.println("Result = " + hasPairWithSum(null, 0));
    }

    private static boolean hasPairWithSum(int[] arr, int sum) {

        // worst case
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == sum) {
//                    return true;
//                }
//            }
//        }
//        return false;

        if (sum == 0 || arr.length <= 0) {
            return false;
        }

        HashSet<Integer> differenceSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (differenceSet.contains(arr[i])) {
                return true;
            }
            differenceSet.add(sum - arr[i]);
        }

        return false;

    }
}
