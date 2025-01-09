// Link :https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/0

class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0;
        
        for (int i = 0; i <= k && i < arr.length; i++) {
            pq.add(arr[i]);
        }
        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = pq.remove();
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            arr[index++] = pq.remove();
        }
    }