// Link - https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest

class Solution {
    public int print2largest(int[] arr) {
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 1 ; i < arr.length ; i++){
            if(arr[i] > largest ){
                sLargest = largest;
                largest = arr[i];
            } else if( arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
}