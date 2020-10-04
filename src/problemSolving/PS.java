package problemSolving;

import java.util.ArrayList;
import java.util.List;

public class PS {


    // n - un-sorted array
    // Step 1 - 1 , 5, 10, 7, 8  // O(N)

    public static void main(String args[]) {

        List<Integer> num = new ArrayList<Integer>();
        num.add(0);
        num.add(0);
        num.add(0);
        num.add(0);
        num.add(0);
        System.out.println("Size = " + num.size());
        System.out.println(findLargestNumber(num));
    }

    private static int findLargestNumber(List<Integer> num) {

        if (num.size() < 0) {
            return -1;
        }

        int highestNumber = num.get(0);
        for (int i = 1; i < num.size(); i++) {
            if (highestNumber < num.get(i)) {
                highestNumber = num.get(i);
            }
        }

        return highestNumber;

    }


}
