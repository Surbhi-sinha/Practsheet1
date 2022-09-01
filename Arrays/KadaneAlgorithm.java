package Arrays;
//problem link = https://leetcode.com/problems/maximum-subarray/

public class KadaneAlgorithm {
      // issi ka dusra naam KADANE'S ALGORTHIM b hai
// jisme maximum sum subarray nikalna hota hai...
// isme kyuki subarray nikalna hota hai to question ban jata hai otherwise agar maximum sub subsequence nikalna ho to koi question hi nhi rha because all positive ka sum krdo ans aa jaega

      public int maxSubArray(int[] nums) {
          int sum = nums[0];
          int csum = sum;
          for(int i = 1 ; i < nums.length ; i++){
              csum = Math.max(csum + nums[i] , nums[i]);
              sum = Math.max(csum , sum);
          }
          
          return sum;
      }

}
