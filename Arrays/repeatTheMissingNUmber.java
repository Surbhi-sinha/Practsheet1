package Arrays;
import java.util.*;

// problem link = https://leetcode.com/problems/missing-number/
public class repeatTheMissingNUmber {
      class Solution {
            public int missingNumber(int[] nums) {
                int len = nums.length;
                int ans = 0;
                for(int val : nums){
                    ans = ans ^ val;
                }
                
                for(int i = 0 ; i <= len ; i++){
                    ans = ans ^ i;
                }
                return ans;
            }
        }
}
