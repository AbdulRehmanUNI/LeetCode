class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        String num = Integer.toString(x);
        int n = 0;
        for(char c: num.toCharArray()){
            n += Character.getNumericValue(c);
        }
        if(x % n == 0) return n;
        return -1;
    }
}