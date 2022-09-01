package Arrays;
// problem link = https://leetcode.com/problems/powx-n/
public class powX_N {
      // use mat krna
// class Solution {
//     public double myPow(double x, int n) {
//         return Math.pow(x,n);
//     }
// }




//dimag laga k iterative methods se solve kia

class Solution{
      public double myPow(double x , int n ){
          if(n == 0 || x == 1) return 1.0;
          if(n == 1) return x;
          if(n == Integer.MIN_VALUE) {
              return (x == -1.0)? 1.0 : 0;
          }
          
           // -2147483648 is the min value of the INTEGER.
          
          
          double ans = 1.0;
          int i = (n < 0 )? -n : n;
          
          while(i > 0){
              //if power odd hui to 1 bar or x multiply kr do else x*x krk multiply krte chalo
              
              if(i % 2 != 0)
                  ans = ans*x;
              
              x *= x;
              i /= 2;
          }
          
          return (n > 0)? ans : 1/ans;
      }
  }
  
  
}
