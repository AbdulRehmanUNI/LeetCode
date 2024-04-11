class Solution {
    public boolean checkValidString(String s) {
        int open = 0, close = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
                close++;
            } else if (c == ')') {
                if (open > 0) open--;
                close--;
            } else {
                if (open > 0) open--;
                close++;
            }
            if (close < 0) return false; 
        }
        return open == 0;
        
    }
}