package leetcode.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * 
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * 
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * 
 * Constraints:
 * 
 * 2 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */


public class TwoSum {

    public static void main(String[] args) {

        // target

        int target = 9;

        int nums[] = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;

        int[] results = findTwoSum(nums, target);

        for (int item :
                results) {
            System.out.print(item + " ");
        }
    }

    private static int[] findTwoSum(int[] nums, int target) {

        int result[] = new int[2];

        switch (3) {
            case 1:
                // fixme: O(n^2)
                approach1(nums, result, target);
                break;

            case 2:
                //fixme: TIME - O(n) & SPACE O(N)
                approach2(nums, result, target);
                break;

            case 3:
                //fixme: TIME - O(N) & SPACE O(N)
                approach3(nums, result, target);
                break;
        }


        return result;


    }

    /**
     *
     * Time complexity : O(n) We traverse the list containing nn elements only once. Each look up in the table costs only O(1) time.
     * Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores at most N elements.
     *
     *
     */
    private static int[] approach3(int[] nums, int[] result, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * To improve our run time complexity, we need a more efficient way to check if the complement exists in
     * the array. If the complement exists, we need to look up its index.
     * What is the best way to maintain a mapping of each element in the array to its index?
     * 
     * A HASH TABLE. :: Look up is O(1)
     *
     * @return
     */

    // FIXME TIME - O(n) & SPACE O(N)
    private static int[] approach2(int[] nums, int[] result, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];
            if (map.containsKey(complement) && map.get(complement) != j) {
                return new int[]{j, map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }


    /**
     * Complexity Analysis
     * 
     * Time complexity : O(n^2). For each element, we try to find its complement
     * by looping through the rest of array
     * which takes O(n)*O(n) time. Therefore, the time complexity is O(n^2).
     *
     * @param nums
     * @param result
     * @param target
     * @return
     */
    private static int[] approach1(int[] nums, int[] result, int target) { // ---> O(n^2)

        for (int i = 0; i < nums.length; i++) { // O(n)

            int value = nums[i];
            for (int j = i + 1; j < nums.length; j++) { // O(n)
                int sum = value + nums[j];

                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }

            }

        }
        return result;
    }

}
