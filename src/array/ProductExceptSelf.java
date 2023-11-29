package array;/*

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


*/

public class ProductExceptSelf {

    private void productExceptSelfCal(int arr[], int n) {
        if (n == 1) {
            System.out.print("0");
            return;
        }


        int result[] = new int[n];


        int i, temp = 1;

        for (i = 0; i < n; i++) {
            result[i] = temp;
            temp *= arr[i];
        }

        temp = 1;

        for (i = n - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= arr[i];
        }

        for (i = 0; i < n; i++)
            System.out.print(result[i] + " ");

        return;
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        ProductExceptSelf pa = new ProductExceptSelf();
        int arr[] = { 1,2,3,4 };
        int n = arr.length;
        System.out.println("The product array is : ");
        pa.productExceptSelfCal(arr, n);
    }

}
