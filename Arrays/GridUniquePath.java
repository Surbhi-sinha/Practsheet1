package Arrays;
// problem link = https://leetcode.com/problems/unique-paths/
public class GridUniquePath {
      //rajneesh bhaiya ka tareeka

class Solution {
      public int uniquePaths(int m, int n) {
          int[][] dir = {{-1 , 0} , {0 , -1}} ;
          int[][] dp = new int[m][n];
          
          int ans = uniquePathTabu(m-1 , n-1 , dp , dir);
          return ans;
      }
      
      public int uniquePathsmemo(int er , int ec , int[][] dp , int[][] dir){
          if (er == 0 && ec == 0) {
              return dp[er][ec] = 1;
          }
  
          if (dp[er][ec] != 0)
              return dp[er][ec];
  
          int count = 0;
          for (int d = 0; d < dir.length; d++) {
              int r = er + dir[d][0];
              int c = ec + dir[d][1];
              if (r >= 0 && c >= 0 && r < dp.length && c < dp[0].length) {
                  count += uniquePathsmemo(r, c, dp, dir);
              }
          }
  
          return dp[er][ec] = count;
      } 
      
      public  int uniquePathTabu(int ER, int EC , int[][] dp , int[][] dir){
          for(int er = 0 ; er <= ER ; er++ ){
              for(int ec = 0 ; ec <= EC ; ec++){
                  if(ec == 0 && er == 0) {
                      dp[er][ec] = 1;
                      continue;
                  }
  
                  int count = 0;
                  for (int d = 0; d < dir.length; d++) {
                      int r = er + dir[d][0];
                      int c = ec + dir[d][1];
                      if (r >= 0 && c >= 0 && r < dp.length && c < dp[0].length) {
                          count += dp[r][c];
                      }
                  } 
                  dp[er][ec] = count;
              }
          }
          
          return dp[ER][EC];
      }
      
  }
}
