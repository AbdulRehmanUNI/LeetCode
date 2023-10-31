class Solution {
    public int[] findArray(int[] pref) {
        
        int[] arr=new int[pref.length];
        for(int i=1; i<pref.length ;i++) arr[i]=pref[i] ^ pref[i-1];
        arr[0]=pref[0];
        return arr;
    }
}