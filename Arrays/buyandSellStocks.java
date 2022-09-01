package Arrays;
// problem link = https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class buyandSellStocks {
      // /striver ki sheet ka question

// acha iska ek brute force tareeka b hai ki tum arr[i] pr kharade ho jao or bache hue aar me se max nikal lao or dono ko minus krk return kra do jo ki TC dega O(n*n);
// isse badhiay hai neeche vala solution jo ki O(n) me solve kr dega;

class Solution {
      public int maxProfit(int[] prices) {
          int min = (int)1e9;
          int profit = 0;
          for(int i = 0 ; i < prices.length ; i++){
              if(prices[i] < min){
                  min = prices[i];
              }
              
              if(prices[i] - min > profit){
                  profit = prices[i] - min;
              }
          }
          
          return profit;
      }
  }
}
