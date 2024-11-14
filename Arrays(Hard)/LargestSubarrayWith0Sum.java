//Link : https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?category%5B%5D=Hash&company%5B%5D=Amazon&page=1&query=category%5B%5DHashcompany%5B%5DAmazonpage1company%5B%5DAmazoncategory%5B%5DHash&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-subarray-with-0-sum


class Solution {
    int maxLen(int arr[]) {
       
        Map<Integer,Integer>map=new HashMap<>();
       int mlen = 0;
       int i = -1;
       int sum = 0;
       map.put(sum , i);
       while(i < arr.length-1){
           i++;
           sum += arr[i];
           if(map.containsKey(sum) == false){
               map.put(sum, i);
               
           } else {
               int len = i - map.get(sum);
               if(len > mlen){
                   mlen = len;
               }
           }

    }
     return mlen;
}
}