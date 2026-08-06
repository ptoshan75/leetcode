//Leetcode Number 1

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        /*int[] arr = new int[2];
        
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }

        return arr;*/

        HashMap<Integer, Integer> n = new HashMap<>();
        int[] ans = new int[2];

        for (int i=0; i<nums.length; i++){
            n.put(nums[i], i);
        }

        for (int i=0; i<nums.length; i++){
            int r = target - nums[i];

            if (n.containsKey(r) && n.get(r) != i){
                ans[0] = i;
                ans[1] = n.get(r);
            }
        }
        
        return ans;

    }
}