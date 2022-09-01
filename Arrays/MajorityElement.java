package Arrays;
import java.util.*;

// problem link = https://leetcode.com/problems/majority-element/
public class MajorityElement {
      // maine khud se solve kia hai khud se

class Solution {
      public int majorityElement(int[] nums) {
          HashMap<Integer , Integer> map = new HashMap<>();
          for(int val : nums){
              if(! map.containsKey(val)){
                  map.put(val , 1);
              }else{
                  map.put(val , map.get(val) +1);
              }
          }
          int n = nums.length , ans = 0;        
          for(int val : map.keySet()){
              if(map.get(val) > n/2) ans= val;
          }
          
          return ans;
      }
  }
}
