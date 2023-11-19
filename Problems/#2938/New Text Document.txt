class Solution {
    public long minimumSteps(String s) {
        long ans=0,j=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0') ans+=i-j++; //for black balls
            // if(s.charAt(i)=='1') ans+=i-j++; for white balls
        }
        return ans;
    }
}