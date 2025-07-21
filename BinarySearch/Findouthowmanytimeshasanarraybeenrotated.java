// https://www.geeksforgeeks.org/problems/rotation4723/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=rotation

class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int index = -1;

        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[low] <= arr[high]){
                ans = Math.min(ans, arr[low]);
                index = low;
                break;
            }

            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                index = low;
                low = mid +1;
            } else {
                ans = Math.min(ans, arr[mid]);
               index = mid;
                high = mid-1;
            }
        }
        return index; 
    }
}