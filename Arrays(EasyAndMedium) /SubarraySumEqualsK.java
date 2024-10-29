//Link : https://leetcode.com/problems/subarray-sum-equals-k/description/

class Solution {
    public int subarraySum(int[] arr, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);
        int sum = 0;

        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
            int remainSum = sum - k;

            if(map.containsKey(remainSum)){
                ans += map.get(remainSum);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return ans;

    }
}