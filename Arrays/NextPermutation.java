package Arrays;
import java.util.*;
//problem link = https://leetcode.com/problems/next-permutation/
public class NextPermutation {
      // striver ki vedio

// method:- 

    // traverse from left and find the element a[i] < a[i+1] and mark that index  as ind1;
    // again traverse from the back and find just a number biggger then the a[ind1](a[ind2] > a[ind1])
    // swap(a[ind1] , a[ind2]); 
    // reverse(ind1+1 - > last);

    // 13542 ka next lexicographical hoga 14235  
        // 1st step me ind1 = 1 (3) where( a[i] < a[i+1]);
        // 2nd step me ind2 = 3 (4) where (a[ind2] > a[ind1]);
        //swap krne pr ind1 and ind2 => 13542 => 14532
        // reverse kia ind1+1 -> last tak ==> 14235  jo ki hamara ans tha

      public void nextPermutation(int[] nums) {
          
          if(nums == null || nums.length <= 1) return;
          int i = nums.length -2;
          while(i >= 0 && nums[i] >= nums[i+1]) i--;
          if(i >= 0){
              int j = nums.length -1;
              while(nums[j] <= nums[i]) j--;
              swap(nums , i , j);
          }
          
          reverse(nums , i+1 , nums.length-1);
      }
      
      private void swap(int[] arr , int i , int j ){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
      }
      
      private void reverse(int[] nums , int i , int j){
          while( i < j) swap(nums , i++ ,j--);
      }
  
}
