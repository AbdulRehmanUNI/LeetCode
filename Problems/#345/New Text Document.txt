class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> temp=new ArrayList<>();
        
        for(char c: s.toCharArray()){
            if(c=='a' || c=='i' || c=='o' || c=='u' || c=='e' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') temp.add(c);
        }
        int num=temp.size()-1;
        char[] c=s.toCharArray();
        
        for(int i=0; i<c.length; i++){
            if(c[i]=='a' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='e' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U'){
                c[i]=temp.get(num--);
            }
        }
        return String.valueOf(c);
        
    }
}