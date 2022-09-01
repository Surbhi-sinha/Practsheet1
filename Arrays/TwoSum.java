package Arrays;
import java.util.*;
// problem link = https://leetcode.com/problems/two-sum/
public class TwoSum {
      // jo iska basic solution hai vo n*n ka hoga jisme i ko fie kro or fir j ka iteration kro
// isse acha yeah vala solution hai o(n) ki time complexity k sath

// maine khud kia hai

class Solution {
      public int[] twoSum(int[] numbers, int target) {
          
          HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
          
          for(int i = 0; i < numbers.length; i++){
              Integer requiredNum = (Integer)(target - numbers[i]);
              if(map.containsKey(requiredNum)){
                  int ans[] = {map.get(requiredNum), i};
                  return ans;
              }
  
              map.put(numbers[i], i);
          }
          return null;
      }
  }
}
