//Leetcode Number 739

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {

        /*int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            for (int next = i + 1; next < temperatures.length; next++) {

                if (temperatures[next] > temperatures[i]) {
                    ans[i] = next - i;
                    break;
                }
            }
        }

        return ans;*/

        Deque<int[]> stack = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];

        for (int i=0; i<temperatures.length; i++){

            int temp = temperatures[i];

            while (!stack.isEmpty() && stack.peek()[0]<temp){
                int[] prev = stack.pop();
                ans[prev[1]] = i - prev[1]; 
            }

            stack.push(new int[] {temp, i});

        }

        return ans;
    }
}
