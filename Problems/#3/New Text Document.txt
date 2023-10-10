class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        for(int i=0; i<s.length() ; i++){
            int temp=test(s,i,s.length());
            if (temp>ans) ans=temp;
        }
        return ans;
        
    }
    public int test(String s, int start, int end){
        int ans=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=start; i<end; i++){
            if(hs.contains(s.charAt(i))) return ans;
            else ans++;
            hs.add(s.charAt(i));         
        }
        return ans;
    }
}