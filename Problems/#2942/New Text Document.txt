class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        String ch=x+"";
        for(int i=0; i<words.length; i++){
            if(words[i].contains(ch)) ans.add(i);
        }
        return ans;
    }
}