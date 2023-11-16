class Solution {
    public String sortVowels(String s) {
        List<Integer> indices=new ArrayList<>();
        List<Character> chars=new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            Character c=s.charAt(i);
            if(isVowel(c)){
                indices.add(i);
                chars.add(c);
            } 
        }
        if(indices.size()==0) return s;

        Collections.sort(chars);
        char[] char_str = s.toCharArray();
        int j=0;
        for(int i=0; i<indices.size(); i++){
            char_str[indices.get(i)]=chars.get(j);
            j++;
        }
        return String.valueOf(char_str);
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".contains(String.valueOf(c));
    }
}