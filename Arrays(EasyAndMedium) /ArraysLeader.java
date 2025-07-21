// link : https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=leaders-in-an-array

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        
      ArrayList<Integer> ans = new ArrayList<>();
      int max = arr[n-1];
      ans.add(arr[n-1]);
      
      for(int i =n-2; i>=0;i--){
          if(arr[i] > max){
              ans.add(arr[i]);
              max = arr[i];
          }
          
      }
     Collections.reverse(ans);
        
        return ans;
      
    }
    
}
