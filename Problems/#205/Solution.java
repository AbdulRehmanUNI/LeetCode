class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] one= new int[128], two=new int[128];

        for(int i=0; i<s.length(); i++){
            if(one[s.charAt(i)]!=two[t.charAt(i)]) return false;
            one[s.charAt(i)]=i+1;
            two[t.charAt(i)]=i+1;
        }   
        return true;
    }
}