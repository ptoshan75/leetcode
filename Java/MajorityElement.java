//Leetcode Number 169

import java.util.HashMap;

class MajaorityElement {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i : nums){
            frequency.put(i, frequency.getOrDefault(i, 0) + 1);
        }

        int max = nums.length/2;

        for (int i : nums){
            if (frequency.get(i) > max){
                return i;
            }
        }

        return -1;

    }
}