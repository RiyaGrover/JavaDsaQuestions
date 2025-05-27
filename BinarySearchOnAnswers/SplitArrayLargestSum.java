// link - https://leetcode.com/problems/split-array-largest-sum/description/

class Solution {
    public int splitArray(int[] arr, int k) {
    int n = arr.length;
    if(k > n) return -1;
    int low = Integer.MIN_VALUE;
    int high = 0;
    for(int i = 0; i < n;i++){
        low = Math.max(low, arr[i]);
        high += arr[i];
    }
    while(low <= high){
        int mid = (low+high)/2;
        int noOfPeople = countPeople(arr, mid);
        if(noOfPeople > k) low = mid+1;
        else high = mid-1;
    }

     return low;   
    }

    public int countPeople(int[] arr, int parts){
        int n = arr.length;
        int peo = 1;
        int partsPeo = 0;

        for(int i =0 ;i < n ; i++){
            if(partsPeo + arr[i] <= parts){
                partsPeo += arr[i];
            } else {
                peo++;
                partsPeo = arr[i];
            }
        }
        return peo;
    }
}