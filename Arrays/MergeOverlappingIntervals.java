package Arrays;
import java.util.*;
import java.io.*;
//problem link = https://leetcode.com/problems/merge-intervals/
public class MergeOverlappingIntervals {

      // striver ki sheet 
// smajk solve kia hai to smaj aa gaya hai.

// method:-
//   iska solution b open hai leetcode pr
//     pehle sort on the basis or start time;
//     ab bas check krte chalo intervals ka time and arrange krte chalo
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}


}