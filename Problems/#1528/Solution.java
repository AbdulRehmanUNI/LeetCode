class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans=new char[indices.length];

        for(int i=0; i<indices.length; i++) ans[indices[i]]=s.charAt(i);
        // String a="";
        // for(int i=0; i<ans.length; i++) a+=ans[i];
        // return a;
        String str=new String(ans);
        return str;
    } 
}