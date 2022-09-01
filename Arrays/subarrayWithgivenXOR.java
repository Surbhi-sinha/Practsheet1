package Arrays;

public class subarrayWithgivenXOR {
      public class Solution {
            public int solve(int[] A, int B) {
                int count = 0;
                for(int i = 0 ; i < A.length ;i++){
                    int XOR = A[i];
                    for(int j = i+1 ; j < A.length ;j++){
                        XOR = XOR ^ A[j];
                        if(XOR == B) count++;
                    }
                }
                return count;
            }
        }
        
}
