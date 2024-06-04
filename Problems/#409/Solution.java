class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<>();
        int ans=0;
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                ans+=2;
                set.remove(c);
            }else 
            set.add(c);
        }
        if(!set.isEmpty()) ans+=1;
        return ans;
        // int[] freq= new int[128];
        // int ans=0;

        // for(char c: s.toCharArray()){
        //     freq[c-'A']++;
        //     if(freq[c-'A']%2==0) ans+=2;
        // }
        // for(int f: freq){
        //     if(f%2==0) ans+=1;
        //     break;
        // }
        // return ans;
    }
}