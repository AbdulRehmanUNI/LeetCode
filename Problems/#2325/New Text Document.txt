class Solution {
    public String decodeMessage(String key, String message) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        HashMap<Character, Character> converter = new HashMap<>();
        int counter=0;
        for(char i:key.toCharArray()){
            if(i==' ') continue;
            if(!converter.containsKey(i)) converter.put(i, alphabet[counter++]);
            if(counter==26) break;
        }
        String ans="";
        for(int i=0; i<message.length(); i++){
            Character temp=message.charAt(i);
            if(temp==' ') ans+=" ";
            else ans+=converter.get(temp);
        }
        return ans;
    }
}