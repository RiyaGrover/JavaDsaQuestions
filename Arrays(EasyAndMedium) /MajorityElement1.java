//Link :https://leetcode.com/problems/majority-element/


class Solution {
    public int majorityElement(int[] arr) {
        int count = 0;
        int ele = 0;  // Initialize ele to avoid compilation error
        for (int i = 0; i < arr.length; i++) {  // Use arr.length instead of arr.size()
            if (count == 0) {
                count = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }
        }

        // Verify if ele is actually the majority element
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {  // Use arr.length instead of arr.size()
            if (arr[i] == ele) {
                cnt++;
            }
        }

        // Check if ele occurs more than n/2 times
        if (cnt > arr.length / 2) {
            return ele;
        } else {
            return -1;
        }
    }
}
