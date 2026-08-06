//Leetcode Number 1189

import java.util.HashMap;

class MaximumNumberOfBallons {
    public int maxNumberOfBalloons(String text) {
        
        HashMap<Character, Integer> count = new HashMap<>();
        String b = "balloon";

        for (char c : text.toCharArray()){
            if (b.indexOf(c) != -1){
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
        }

        if (!count.containsKey('b') ||
            !count.containsKey('a') ||
            !count.containsKey('l') ||
            !count.containsKey('o') ||
            !count.containsKey('n')){
                return 0;
        }
        else{
             return Math.min(Math.min(count.get('b'), count.get('a')), 
                            Math.min(count.get('l') / 2, 
                                     Math.min(count.get('o') / 2, count.get('n'))));
        }

    }
}