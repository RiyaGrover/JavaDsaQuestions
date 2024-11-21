//  https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] arr, int target) {
        int lb = firstOccurance(arr, arr.length, target);
        if(lb == -1) return new int[] {-1,-1};
        int ub = lastOccurance(arr, arr.length, target);
        return new int[] {lb,ub};  
    }


    public int firstOccurance(int [] arr, int n , int target){
        int low = 0;
        int high = n-1;
        int first =-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                first = mid;
                high = mid-1;            
        } else if(arr[mid] < target){
            low = mid+1;

        } else {
            high = mid-1;
        }
        
    }
    return first;
 }

    public int lastOccurance(int[] arr , int n, int target){
        int low = 0;
        int high = n-1;
        int last =-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            } else if(arr[mid] < target){
                low = mid+1;
            } else {
                high = mid-1;
            }

    }
    return last;
}
}