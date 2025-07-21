// Link : https://leetcode.com/problems/sort-characters-by-frequency/description/

class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i < s.length();i++){
        char ch = s.charAt(i);
        if(map.containsKey(ch)){
            int of = map.get(ch);
            int nf = of+1;
            map.put(ch , nf);
        } else {
            map.put(ch, 1);
           }
        }

         List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
         entryList.sort((a,b) -> b.getValue() - a.getValue());

         StringBuilder sb = new StringBuilder();
         for (Map.Entry<Character, Integer> entry : entryList) {
            char key = entry.getKey();
            int frequency = entry.getValue();
            // Append the character 'frequency' times
            for (int i = 0; i < frequency; i++) {
                sb.append(key);
            }
        }

        // Step 5: Return the result string
        return sb.toString();
    }

        
    }
