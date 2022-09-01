package Arrays;
import java.util.*;
// problem link = https://leetcode.com/problems/reverse-pairs/
public class ReversePairs {
      // very good question
// striver sheet question merger sort ka use krk
// maine khud kia hai

class Solution {
      public int reversePairs(int[] nums) {
          int lo = 0;
          int hi = nums.length-1;
          return reversePairhelper(nums , lo , hi);
      }
      
      public int reversePairhelper(int[] nums , int lo , int hi){
          if(lo == hi){
              return 0;
          }
          int count = 0;
          int mid = (lo+hi)/2;
          count += reversePairhelper(nums , lo , mid);
          count += reversePairhelper(nums , mid+1 , hi);
          count += sort(nums , lo , mid , hi);
          
          return count;
      }
      
      public int sort(int[] nums , int lo , int mid ,int hi){
          int count= 0;
          int[] left = Arrays.copyOfRange(nums , lo , mid+1);
          int[] right = Arrays.copyOfRange(nums , mid+1 , hi+1);
          int k = lo;
          int i = 0 , j = 0;
          
          // yaha pr laga hai dimag
          
          // if suppose uperse call lagne k baad saari array sort hoke aayi hai to if(left vali arr jo ki sorted hai or right vali array jo ki also sorted hai usme agr[[left[i] > 2L * right[j]]] vali condition ho jae to hum j++ kr denge or right vali array me aage badh jaenge otherwise left vali array me aage badh jaenge; )
          
          while(i < left.length && j < right.length){
              if(left[i] > 2L * right[j]){ // YAHA PR YEAH 'L' long vale cases ko smabhalne klie hai integer ki max value.
                  count += left.length -i;
                  j++;
              }else i++;
          }
          
          
          // same merge Sort ka code hai
           i = 0 ; j = 0 ;
          while(i < left.length && j < right.length){
              if(left[i] <= right[j]){
                  nums[k] = left[i];
                  i++;
                  k++;
              }else{
                  nums[k] = right[j];
                  k++;
                  j++;
              }
          }
          
          while(i < left.length) nums[k++] = left[i++];
          while(j < right.length) nums[k++] = right[j++];
          
          return count;
      }
  }
}
