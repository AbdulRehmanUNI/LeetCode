class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="";
        String b="";
        
        for(int i=0; i<word1.length; i++) a+=word1[i];
        for(int i=0; i<word2.length; i++) b+=word2[i];

        return a.equals(b);
    }
}

//dec 1 , daily chlng

// class Solution {
//     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         for(int i=1; i<word1.length; i++) word1[0]+=word1[i];
//         for(int i=1; i<word2.length; i++) word2[0]+=word2[i];
//         //if(word1[0].length()!=word2[0].length()) return false;
//         return word1[0].equals(word2[0]);
//     }
// }