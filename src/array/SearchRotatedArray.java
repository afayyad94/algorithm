package array;

/*
 Statement
We’re given a sorted integer array, nums and an integer value, target. The array is rotated by some arbitrary number. Search the target in this array. If the target does not exist then return -1.

 
  
  */
public class SearchRotatedArray {

    static int binarySearch(int[] nums, int start, int end, int target) {
        if (start > end)
            return -1;

        // Finding mid using floor division
        int mid = start + (end - start) / 2;

        if (nums[mid] == target)
            return mid;

        // start to mid is sorted
        if (nums[start] <= nums[mid])
            if (nums[start] <= target && target < nums[mid])
                return binarySearch(nums, start, mid - 1, target);
            else
                return binarySearch(nums, mid + 1, end, target);
            // mid to end is sorted
        else if (nums[mid] < target && target <= nums[end])
            return binarySearch(nums, mid + 1, end, target);
        else
            return binarySearch(nums, start, mid - 1, target);
    }

    static int binarySearchRotated(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }


    public static void main(String args[]) {
        int[] numsLists = { -1, 0, 3, 5, 9, 12 };
        System.out.print(binarySearchRotated(numsLists, 5));

    }

}