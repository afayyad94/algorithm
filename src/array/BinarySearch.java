package array;

public class BinarySearch {

    static int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int high = nums.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid;
            } else if (nums[mid] < target) {
                low = mid;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int[] numsLists = { -1, 0, 3, 5, 9, 12 };
        System.out.print(binarySearch(numsLists,5));

    }
}