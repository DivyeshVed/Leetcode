package Leetcode;

import java.util.HashMap;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 * There are multiple ways that we can solve this problem:
 *  1. Brute force - this uses two for loops and iterates through the array for every element. This has a time complexity of O(n^2).
 *  2. Sorting - you can sort the array and then iterate looking for the next closes elements to the current one.
 *      This would be a O(nlogn) complexity as the sorting is O(nlogn)
 *  3. HashMap - this is the implemented method. This method uses a hashmap, such that each element in placed in the hashmap, and checked
 *      before placing if the element is already present. If it is already present, then we return true, and terminate. Time complexity of
 *      O(1) as hashmap operations have O(1) time complexity.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        for (int a = 0; a < nums.length; a++){
            if (intMap.containsValue(nums[a])){
                return true;
            } else {
                intMap.put(a, nums[a]);
            }
        }
        return false;
    }
}
