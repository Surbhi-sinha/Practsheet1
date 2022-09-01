package Arrays;
import java.util.*;

// problem link = https://leetcode.com/problems/majority-element-ii/
public class MajorityElement2 {
      // maine khud kia 

class Solution {
      public List<Integer> majorityElement(int[] arr) {
          int n = (arr.length)/3;
          List<Integer> ans = new ArrayList<>();
          HashMap<Integer , Integer> map = new HashMap<>();
          
          for(int i = 0; i < arr.length ; i++){
              if(!map.containsKey(arr[i])){
                  map.put(arr[i] ,1);
              }else{
                  map.put(arr[i] , map.get(arr[i])+1);
              }
          }
          
          for(int val : map.keySet()){
              if(map.get(val) > n){
                  ans.add(val);
              }
          }
          return ans;
      }
  }
}
