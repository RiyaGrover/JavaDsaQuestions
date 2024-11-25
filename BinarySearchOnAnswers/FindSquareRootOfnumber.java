// Link : https://www.geeksforgeeks.org/problems/square-root/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=square-root

class Solution {
    int floorSqrt(int n) {
        // Your code here
        
        int low = 1;
        int high = n;
        int ans = 1;
        while(low <= high){
             int mid = (low+high)/2;
            int sqa = mid*mid;
            
            if(sqa <= n ){
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }
}
