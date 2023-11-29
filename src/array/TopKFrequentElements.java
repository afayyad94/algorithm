package array;
/*

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]


 */


import java.util.*;


public class TopKFrequentElements {


    public  List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        // corner case: if there is only one number in nums, we need the bucket has index 1.
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int n:map.keySet()){
            int freq = map.get(n);
            if(bucket[freq] == null)
                bucket[freq] = new LinkedList<>();
            bucket[freq].add(n);
        }



        List<Integer> res = new LinkedList<>();
        for(int i = bucket.length-1; i>0 && res.size() < k; --i){
            if(bucket[i] != null){
                res.addAll(bucket[i]);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] numsLists = {1,1,1,2,2,3};
      List<Integer> result =   new TopKFrequentElements().topKFrequent(numsLists, 2);
        System.out.println("Hey: " +  result );
    }
}
