//Leetcode Number 228

import java.util.ArrayList;
import java.util.List;

class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> arr = new ArrayList<>();

        for (int i=0; i<nums.length; i++){
            Integer start = nums[i];
            Integer end = nums[i];
            while(i != nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
                end = nums[i];
            }
            if (start.equals(end)){
                arr.add(start.toString());
            }
            else{
                arr.add(start.toString() + "->" + end.toString());
            }
        }

        return arr;
    }
}