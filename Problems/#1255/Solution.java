class Solution {
    int ans=0;
    
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] letters_freq=new int[26];
        for(char c: letters) letters_freq[c-'a']++;
        solve(0, words, letters_freq, score, 0);
        return ans;
    }
    
    public void solve(int i, String[] words, int[] letters_freq, int[] score, int currentScore){
        if(i== words.length) {
            ans = Math.max(ans, currentScore);
            return;
        }
        
        // exclude
        solve(i+1, words, letters_freq, score, currentScore); 
        
        // include
        char[] word= words[i].toCharArray();
        int[] freq= new int[26];
        for(char c: word) freq[c-'a']++;
        int[] temp= Arrays.copyOf(letters_freq,letters_freq.length);
        int tem=0;
        for(int j=0; j<26; j++){
            temp[j] -= freq[j];
            if(temp[j] < 0) return; // if word can't be formed, return
            tem += freq[j] * score[j]; // calculate score of word
        }
        solve(i+1, words, temp, score, currentScore + tem); // include, recurse with the rest of the words
    }
}s