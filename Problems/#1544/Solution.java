class Solution {
    public String makeGood(String s) {
        ArrayList<Character> list=new ArrayList<>();
        int n=list.size();
        for(char c: s.toCharArray()){
            list.add(c);
            n=list.size();
            if(n>=2){
                if(Character.toLowerCase(list.get(n-1))== Character.toLowerCase(list.get(n-2)) && list.get(n-1)!= list.get(n-2)){
                    list.remove(n-1);
                    list.remove(n-2);
                }
            }
        }
        s="";
        for(char c: list) s+=c;
        return s;

    }
}