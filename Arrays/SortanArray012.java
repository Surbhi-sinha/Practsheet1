package Arrays;
//problem link = https://leetcode.com/problems/sort-colors/

public class SortanArray012 {
      // STRIVER KI SHEET ME HAI
// pep coding ka rata rataya question

class Solution {
      public void sortColors(int[] nums) {
          int i =0 , j = 0 , k = nums.length-1;
          
          while(i <= k){
              if(nums[i] == 1){
                  i++;
              }else if(nums[i] == 2){
                  swap(nums , i , k);
                  k--;
              }else{
                  swap(nums , i ,j );
                  i++;
                  j++;
              }
          }
      }
      
      public void swap(int[] arr , int i , int j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
      }
  }
}
