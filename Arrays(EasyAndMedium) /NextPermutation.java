// Link :https://leetcode.com/problems/next-permutation/
import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] a) {
        int n = a.length;
        int ind = -1;

        // Step 1: Find the first decreasing element from the end
        for (int i = n - 2; i >= 0; i--) {  // Changed `2` to `n - 2`
            if (a[i] < a[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no such element is found, reverse the whole array
        if (ind == -1) {
            arrayReverse(a, 0, n - 1);  // Reverse entire array
            return;
        }

        // Step 3: Find the element just larger than a[ind] from the right
        for (int i = n - 1; i > ind; i--) {
            if (a[i] > a[ind]) {
                // Swap a[i] and a[ind]
                int temp = a[i];
                a[i] = a[ind];
                a[ind] = temp;
                break;
            }
        }

        // Step 4: Reverse the portion after the found index (ind)
        arrayReverse(a, ind + 1, n - 1);
    }

    // Utility function to reverse the array or a portion of it
    private void arrayReverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
