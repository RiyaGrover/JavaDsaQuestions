// 
class Solution {

    static int findFloor(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
    int ans = -1; // Default to -1 if no floor exists
    
    while (low <= high) {
        int mid = low + (high - low) / 2;
        
        if (arr[mid] <= k) {
            ans = mid;  // Update answer since arr[mid] is a valid floor
            low = mid + 1;  // Move right to find a potentially larger floor
        } else {
            high = mid - 1;  // Move left to find a smaller element
        }
    }
    
    return ans;
    }
  
}

