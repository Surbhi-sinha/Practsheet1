package Arrays;

import java.util.*;
// problem link =https://leetcode.com/problems/longest-consecutive-sequence/
public class longestConsecutiveSequence {
      class Solution {
            public int longestConsecutive(int[] nums) {
                    HashSet<Integer> set = new HashSet<>();
                    for(int num : nums)
                          set.add(num);
                    int max = 0;
                    for(int num : nums){
                          if(set.contains(num-1)) 
                                continue;
                          int cnum = num;
                          int count = 1;
                          while(set.contains(cnum+1)){
                                count++;
                                cnum++;
                          }
                          max = Math.max(max,count);
                    }
                    return max;
              }
        }
}
