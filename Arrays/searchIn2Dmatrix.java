package Arrays;
// problem link = https://leetcode.com/problems/search-a-2d-matrix/
public class searchIn2Dmatrix {
      // yeah to maine khud hi kia hai apne dimag se :)))

class Solution {
      public boolean searchMatrix(int[][] matrix, int target) {
          int row = 0;
          int m = matrix.length , n = matrix[0].length;
          
          for(int i = 0 ; i < m ;i++){
              if(matrix[i][0] <= target && matrix[i][n-1] >= target ){
                  row = i;
              }
          }
          
          boolean ans = false;
          for(int i = 0 ; i < n ;i++){
              if(matrix[row][i] == target) ans = true;
          }
          
          return ans;
      }
  }
}
