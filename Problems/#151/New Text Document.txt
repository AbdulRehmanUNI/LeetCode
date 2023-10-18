class Solution {
    public String reverseWords(String s) {
        Stack<String> ans=new Stack<>();
        for(int i=0; i<s.length(); i++){
            String word="";
            int j=i;
            while(s.charAt(j)!=' '){
                word+=s.charAt(j);
                j++;
                if(j==s.length()) break;
            } 
            ans.push(word);
            i=j;
        }
        s="";
        while(!ans.isEmpty()) s=s+ ans.pop()+" ";
        return s.trim().replaceAll("\\s{2,}", " ");
    }
}

// was just on the verge of giving up on it. persevered. good job.