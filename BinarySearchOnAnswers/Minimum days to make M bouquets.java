// Link : https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/


class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long)m * (long)k > n) return -1;

      int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int low = mini;
        int high = maxi;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(bloomDay, mid, m,k) == true){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low; 
    }


    public boolean isPossible(int [] arr, int day, int m , int k){
        int count = 0;
        int noOfBouquets = 0;
          int n = arr.length;
        for(int i = 0; i <= n-1 ; i++){
            if(arr[i] <= day){
                count++;
            } else {
                noOfBouquets +=(count/k);
                count = 0;
            }
        }
        noOfBouquets +=(count/k);

        if(noOfBouquets >= m) return true;
        else return false;
    }
}