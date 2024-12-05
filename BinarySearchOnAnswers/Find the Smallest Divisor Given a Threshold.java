// Link : https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/


class Solution {
    public int smallestDivisor(int[] arr, int threshold) {
        int n = arr.length;
        if(n > threshold) return -1;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n ; i++){
            maxi = Math.max(maxi, arr[i]);
        }

        int low = 1;
        int high = maxi;

        while(low <= high){
            int mid = (low+high)/2;
            if(sumByD(arr, mid) <= threshold){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
    public static int sumByD(int[] arr, int mid){
        int n = arr.length;
        int sum =0;
        for(int i =0; i < n ; i++){
            sum += Math.ceil((double)(arr[i])/ (double)(mid));
        }
        return sum;
    }
}