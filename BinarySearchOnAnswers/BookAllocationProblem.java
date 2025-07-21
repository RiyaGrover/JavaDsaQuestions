// link https://takeuforward.org/plus/dsa/problems/book-allocation-problem

class Solution {
    public int findPages(int[] arr, int m) {
    int n = arr.length;
    if(m > n) return -1;

      int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < arr.length; i++) {
            high += arr[i];
            low = Math.max(low, arr[i]);
        }
        while(low <= high){
            int mid = (low+high)/2;
           int noOfStudents = countStudents(arr,mid);
            if(noOfStudents > m) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
  public int countStudents(int[] arr, int pages){
    int stu =1;
    int pagesStu = 0;
    int n = arr.length;
    for(int i = 0; i < n ; i++){
        if(pagesStu + arr[i] <= pages){
            pagesStu += arr[i];
        } else {
            stu++;
            pagesStu = arr[i];

        }
        
    }
    return stu;
}

}

