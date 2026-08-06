//Leetcode Number 2390

class RemovingStarsFromString {
    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder("");

        int i = 0;
        int j = 0;

        while (i<s.length()){
            if (s.charAt(i)=='*'){
                j--;
                i++;
                sb.deleteCharAt(j);
            }
            else {
                sb.append(s.charAt(i));
                i++;
                j++;
            }
        }

        return sb.toString();
        
    }
}