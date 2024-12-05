// Link : https://leetcode.com/problems/koko-eating-bananas/description/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = findMax(piles);
        while(low <= high){
            int mid = (low+high)/2;
            int totalH = calculate(piles, mid);
            if(totalH <= h){
                high = mid-1;
            } else {
                low = mid+1;
            
            }        
        }

        return low;
    }

    public static int findMax(int[] piles){
        int maxi = Integer.MIN_VALUE;
        int n = piles.length;
        for(int i = 0; i < n ; i++){
            maxi = Math.max(maxi , piles[i]);
        }
        return maxi;
    }

    public static int calculate(int[] piles, int hourly){
        int totalH = 0;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(piles[i]) / (double)(hourly));
        }
        return totalH;

    }
}