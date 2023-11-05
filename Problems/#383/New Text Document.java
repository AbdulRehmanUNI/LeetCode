class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> hs=new ArrayList<>();
        for(int i=0; i<magazine.length(); i++) hs.add(magazine.charAt(i));
        int num=0;
        for(int i=0; i<ransomNote.length(); i++){
            Character ch=ransomNote.charAt(i);
            if(hs.contains(ch)){
                hs.remove(ch);
                num++;
            }
        }
        return  num==ransomNote.length();
    }
}


/*
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        HashMap<Character, Integer> charCountMap= new HashMap<>();
        for(int i=0; i< magazine.length(); i++){
            Character c=magazine.charAt(i);
            if (charCountMap.containsKey(c)) charCountMap.put(c, charCountMap.get(c) + 1);
            else charCountMap.put(c, 1);
        }
        for(int i=0; i<ransomNote.length(); i++){
            Character c=ransomNote.charAt(i);
            if (charCountMap.containsKey(c) && charCountMap.get(c) >0)
                 charCountMap.put(c, charCountMap.get(c)  -1);
            else return false;
        }
        return true;
    }
}
*/