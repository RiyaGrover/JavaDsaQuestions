// https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401


import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      if (x < a[0]) {
            return new int[]{-1, getCeil(a, n, x)};
        }

        // If x is greater than the largest element, ceil doesn't exist
        if (x > a[n - 1]) {
            return new int[]{getFloor(a, n, x), -1};
        }
      int floor = getFloor(a, n , x);
      int ceil = getCeil(a, n, x);
      return new int[] {floor, ceil};    
    }

    public static int getFloor(int[] a, int n , int x){
      int low = 0;
      int high = n-1;
      int ans = -1;
      while(low <= high){
        int mid = (low+high)/2;

        if(a[mid] <= x){
          ans = a[mid];
          low = mid+1;
        } else {
          high = mid-1;
        }
      }
      return ans;

    }
    public static int getCeil(int[] a, int n , int x){
       int low = 0;
        int high = n - 1;
        int ans = -1; // Default to -1 if no strict ceil is found

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] >= x) { // Strictly greater
                ans = a[mid];
                high = mid - 1; // Move to the left for a closer strict ceiling
            } else {
                low = mid + 1;
        }
      }
      return ans;

    }

    
}