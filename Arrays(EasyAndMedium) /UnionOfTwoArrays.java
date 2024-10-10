// Link https://www.naukri.com/code360/problems/sorted-array_6613259?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        
  int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();

        // Merge the two arrays
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }

        // Add remaining elements of array a
        while (i < n) {
            if (union.size() == 0 || union.get(union.size() - 1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }

        // Add remaining elements of array b
        while (j < m) {
            if (union.size() == 0 || union.get(union.size() - 1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }

        return union;
    }
}
