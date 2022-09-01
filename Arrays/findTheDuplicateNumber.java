package Arrays;
import java.util.*;

public class findTheDuplicateNumber {
      // class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int ans = 0;
//         for(int i = 0 ; i < nums.length -1 ; i++){
//             int xor = nums[i]^ nums[i+1];
//             if(xor==0){
//                 ans = nums[i];
//                 break;
//             }
//         }
        
//         return ans;
//     }
// }



class Solution{
      public int findDuplicate(int[] A){
          Arrays.sort(A);
          int ans1 = 0;
          // int ans2 = 1;
          
          for(int i = 0 ; i < A.length-1 ;i++){
              int xor = A[i] ^ A[i+1];
              if(xor == 0){
                  ans1 = A[i];
                  break;
              }
          }
          
          return ans1;
      }
  }
}
