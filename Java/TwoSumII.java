//Leetcode Number 167

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[2];

        int i = 0, j = numbers.length-1;

        while (i<j){

            if (numbers[i]+numbers[j]==target){
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }

            if (target-numbers[i]<numbers[j]){
                j--;
            }
            else if (target-numbers[i]>numbers[j]){
                i++;
            }

        }
        return ans;
    }
}
