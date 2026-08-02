//Leetcode Number 383

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        /*ArrayList<Character> mag = new ArrayList<>();

        for (char i : magazine.toCharArray()){
            mag.add(i);
        }
        int count = 0;

        for (int i=0; i<ransomNote.length(); i++){
            if (mag.contains(ransomNote.charAt(i))){
                mag.remove((Character)ransomNote.charAt(i));
                count++;
            }
        }

        if (count==ransomNote.length()){
            return true;
        }

        return false;*/

        HashMap<Character, Integer> mag = new HashMap<>();

        for (char m : magazine.toCharArray()){
            mag.put(m, mag.getOrDefault(m, 0) + 1);
        }

        for (char r : ransomNote.toCharArray()){
            if (mag.getOrDefault(r, 0) > 0){
                mag.put(r, mag.getOrDefault(r, 0)-1);
            }
            else{
                return false;
            }
        }

        return true;

    }
}