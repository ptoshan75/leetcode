//Leetcode Number 217

import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> vnums = new HashSet<>();

        for (int i=0; i<nums.length; i++){
            if (vnums.contains(nums[i])){
                return true;
            }
            else{
                vnums.add(nums[i]);
            }
        }

        return false;

    }
}