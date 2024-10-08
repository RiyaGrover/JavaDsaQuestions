//Link - https://www.youtube.com/watch?v=20v8zSo2v18&t=13s - using hashmap (sumit sir)


///  USING HASHMAP  //////

class Solution {
    public int subarraySum(int[] nums, int k) {

        int ans = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int rsum = sum-k;

            if(map.containsKey(rsum)){
                ans += map.get(rsum);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return ans;
        
    }
}



