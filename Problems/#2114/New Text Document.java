class Solution {
    public int mostWordsFound(String[] sentences) {
        int n[] =new int[sentences.length];

        for(int i=0; i<sentences.length; i++){
            int num=check(sentences[i]);
            n[i]=num;
        }
        Arrays.sort(n);
        return n[n.length-1];        
    }
       private static int check(String s){
            int num=1;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='\s') num++;
            }   
            return num;
        }
}