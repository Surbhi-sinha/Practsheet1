package Arrays;
import java.util.*;

// problem link = https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {
      // solution based on aditya verma youtube vedio also known as all unique chars in substring 

class Solution {
      public int lengthOfLongestSubstring(String s) {
          int i = 0 , j = 0 , max = Integer.MIN_VALUE , n = s.length();
          HashMap<Character ,Integer> map = new HashMap<>();
          
          while(j < n){
              // calculations:
              char ch = s.charAt(j);
              map.put(ch , map.getOrDefault(ch , 0) +1);
              
              // condition < k
              if(map.size() > j-i+1){
                  j++;
              }else if(map.size() == j-i+1){ // possibility of getting a candidate for ans
                  max = Math.max(max , j-i+1);
                  j++;
              }else if(map.size() < j-i+1){
                  while(map.size() < j-i+1){ // for further checking
                      map.put(s.charAt(i) , map.get(s.charAt(i))-1 );
                      if(map.get(s.charAt(i)) == 0){ // removing the calculations done for i
                          map.remove(s.charAt(i));
                      }
                      i++;
                      if(map.size() == j-i+1){
                          max = Math.max(max , j-i+1);
                      }
                  }
                  j++; 
              }
              
          }
          if(max == Integer.MIN_VALUE) return 0;
          return max;
      }
  }
}
