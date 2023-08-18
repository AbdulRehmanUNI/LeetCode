class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        int ans=0;
        HashSet<Character> hs = new HashSet<Character>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

        for(int i=left; i<=right  ; i++){
            if(hs.contains(words[i].charAt(0)))
                if(hs.contains(words[i].charAt(words[i].length()-1))) ans++;
        }
        return ans;
    }

}