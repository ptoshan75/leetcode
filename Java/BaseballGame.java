//Leetcode Number 682

import java.util.ArrayList;

class BaseballGame {
    public int calPoints(String[] operations) {
        
        ArrayList<Integer> score = new ArrayList<>();
        int top = -1;
        int ans = 0;

        for (int i=0; i<operations.length; i++){

            if (operations[i].equals("C")){
                score.remove(score.get(top));
                top--;
            }
            else if (operations[i].equals("D")){
                score.add(score.get(top) * 2);
                top++;
            }
            else if (operations[i].equals("+")){
                score.add(score.get(top) + score.get(top-1));
                top++;
            }
            else{
                score.add(Integer.parseInt(operations[i]));
                top++;
            }
        }

        for (int i : score){
            ans += i;
        }

        return ans;

    }
}