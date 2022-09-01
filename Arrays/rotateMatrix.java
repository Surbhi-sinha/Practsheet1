package Arrays;
//problem link = https://leetcode.com/problems/rotate-image/
public class rotateMatrix {
      class Solution {
            public void rotate(int[][] arr) {
                int n = arr.length , m = arr[0].length;
                
            //  transpose
                for(int i = 0; i < n ; i++){
                    for(int j = i ; j < m ; j++){
                        int temp = arr[i][j];
                        arr[i][j] = arr[j][i];
                        arr[j][i] = temp;
                    }
                }
                
                
            //  reverse columns
                int j1 = 0 , j2 = m-1;
                while(j1 < j2){
                    for(int i = 0; i < n ; i++){
                        int temp = arr[i][j1];
                        arr[i][j1] = arr[i][j2];
                        arr[i][j2] = temp;
                    }
                    j1++;
                    j2--;
                }
                
                
            }
        }
}
