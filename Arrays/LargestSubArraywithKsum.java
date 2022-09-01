package Arrays;
import java.util.*;
// problem link = https://leetcode.com/problems/subarray-sum-equals-k/
public class LargestSubArraywithKsum {
      class Solution {
            public int subarraySum(int[] arr, int k) {
                HashMap <Integer , Integer> hm = new HashMap<>();
                hm.put(0 , 1);
                int sum = 0 , ans = 0;
                
                for(int i = 0 ; i< arr.length ; i++ ){
                    sum += arr[i];
                    if(hm.containsKey(sum-k)){
                        ans += hm.get(sum-k);
                    }
                    hm.put(sum , hm.getOrDefault(sum , 0)+1);
                }
                return ans;
            }
        }
        
        
}
