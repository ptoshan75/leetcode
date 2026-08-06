//Leetcode Number 242

import java.util.HashMap;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        //boolean flag = false;

        for (char sc : s.toCharArray()){
            smap.put(sc, smap.getOrDefault(sc, 0)+1);
        }

        for (char tc : t.toCharArray()){
            tmap.put(tc, tmap.getOrDefault(tc, 0)+1);
        }

        /*for (char sc : s.toCharArray()){
            if (smap.get(sc) == tmap.get(sc)){
                flag = true;
            }
            else{
                return false;
            }
        }*/

        return smap.equals(tmap);

    }
}