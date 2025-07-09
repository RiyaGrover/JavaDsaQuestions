//https://leetcode.com/problems/word-ladder/description/


class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if(!wordList.contains(endWord)) return 0;

        Queue<String> que = new LinkedList<>();
        que.offer(beginWord);
        Set<String> vis = new HashSet<>();
        vis.add(beginWord);

        int steps=1;
        while(!que.isEmpty()){
            int size = que.size();
            for(int i = 0; i < size; i++){
                String word = que.poll();
                for (int j = 0; j < word.length(); j++){
                   char[] chars = word.toCharArray();
                    for(char ch ='a' ; ch<= 'z' ;ch++){
                         chars[j] = ch;
                         String nextWord = new String(chars);
                         if(nextWord.equals(endWord)) return ++steps;

                         if(wordSet.contains(nextWord) && !vis.contains(nextWord)){
                            que.offer(nextWord);
                            vis.add(nextWord);
                         }
                    }
                }
            }
             steps++;
        }
       return 0;
    }
    
}