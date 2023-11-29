package array;

import java.util.HashSet;
import java.util.Set;

/*
  
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true

 
 Example 2:

Input: nums = [1,2,3,4]
Output: false
 */

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr) {

        Set<Integer> existNumbers = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!existNumbers.add(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = {10, 20, 30, 40, 10};
        System.out.println("The result is : " + containsDuplicate(nums));

    }



}