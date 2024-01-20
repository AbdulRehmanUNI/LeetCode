class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int prevCount = 0;

        for(int j = 0; j < bank.length; j++){
            int count = 0;
            for(int i = 0; i < bank[j].length(); i++) {
                if(bank[j].charAt(i) == '1') count++;
            }
            if(count != 0) {
                if(prevCount != 0) ans += prevCount * count;
                prevCount = count;
            }
        }
        return ans;
    }
}