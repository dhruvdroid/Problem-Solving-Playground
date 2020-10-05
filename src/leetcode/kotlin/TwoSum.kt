package leetcode.kotlin

import java.util.*

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
object TwoSum {
    @JvmStatic
    fun main(args: Array<String>) {

        // target
        val target = 9
        val nums = IntArray(4)
        nums[0] = 2
        nums[1] = 7
        nums[2] = 11
        nums[3] = 15
        val results = findTwoSum(nums, target)
        for (item in results) {
            print("$item ")
        }
    }

    private fun findTwoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        when (3) {
            1 -> approach1(nums, result, target)     // fixme: O(n^2)

            2 -> approach2(nums, result, target)    //fixme: TIME - O(n) & SPACE O(N)

            3 -> approach3(nums, result, target)    //fixme: TIME - O(N) & SPACE O(N)

        }
        return result
    }

    /**
     *
     * Time complexity : O(n) We traverse the list containing nn elements only once. Each look up in the table costs only O(1) time.
     * Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores at most N elements.
     *
     *
     */
    private fun approach3(nums: IntArray, result: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int?> = HashMap()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
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
    private fun approach2(nums: IntArray, result: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int?> = HashMap()
        for (i in nums.indices) {
            map[nums[i]] = i
        }
        for (j in nums.indices) {
            val complement = target - nums[j]
            if (map.containsKey(complement) && map[complement] != j) {
                return intArrayOf(j, map[complement]!!)
            }
        }
        throw IllegalArgumentException("No two sum solution")
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
    private fun approach1(nums: IntArray, result: IntArray, target: Int): IntArray { // ---> O(n^2)
        for (i in nums.indices) { // O(n)
            val value = nums[i]
            for (j in i + 1 until nums.size) { // O(n)
                val sum = value + nums[j]
                if (sum == target) {
                    result[0] = i
                    result[1] = j
                    return result
                }
            }
        }
        return result
    }
}