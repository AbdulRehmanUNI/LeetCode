class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans=new ArrayList<>();
        for(int i=0; i<words.size(); i++){
            String str=words.get(i);
            String temp="";
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) != separator) temp += str.charAt(j);
                else {
                    if(!temp.equals("")) ans.add(temp);
                    temp = "";
                }
            }
            // Add the last word if it doesn't end with a separator
            if(!temp.equals("")) ans.add(temp);
        }
        return ans;
    }
}