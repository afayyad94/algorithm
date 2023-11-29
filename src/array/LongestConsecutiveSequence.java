package array;
/*


Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.



Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

*/

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums){
            numSet.add(num);
        }

        int longestConsecutive = 0 ;
        int currentConsecutive = 0 ;
        int currentNum = 0 ;


        for (int num : nums) {
            boolean isStartingPoint = !numSet.contains(num-1);
            currentNum = num;
            currentConsecutive = 0;

            while(isStartingPoint){
                currentConsecutive += 1;
                currentNum += 1;
                if(!numSet.contains(currentNum)){
                    break;
                }
            }

            if (currentConsecutive > longestConsecutive ) {
                longestConsecutive = currentConsecutive;
            }

        }

        return longestConsecutive;

    }
    public static void main(String[] args) {
        int arr[] = { 100,4,200,1,3,2,5,7 };
        System.out.println(new LongestConsecutiveSequence().longestConsecutive(arr));

    }
}
