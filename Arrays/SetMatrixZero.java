package Arrays;
import java.util.*;

/**
 * SetMatrixZero
      problem link = https://leetcode.com/problems/set-matrix-zeroes/
 */
public class SetMatrixZero {

      public void setZeroes(int[][] matrix) {
            int rowsize = matrix.length;
            int colsize = matrix[0].length;
            int[] rowMarker = new int[rowsize];
            int[] colmarker = new int[colsize];
    //         finding the zero;
            for(int i = 0; i < matrix.length ; i++){
                for(int j = 0 ; j < matrix[0].length ; j++){
                    if(matrix[i][j] == 0){
                        // and marking the index of ith and jth row and col so that they can b make 0.
                        rowMarker[i] = 1;
                        colmarker[j] = 1;
                    }
                }
            }
            
            for(int i = 0 ; i < rowsize ; i++){
                for(int j = 0 ; j < colsize ; j++){
                    if(rowMarker[i]==1 || colmarker[j]==1){
                        matrix[i][j] = 0;
                    }
                }
            }
            
        }
}