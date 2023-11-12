class Solution {
    public int minPartitions(String n) {
        int max=Integer.MIN_VALUE;


        for(int i=0; i<n.length(); i++){
            int digit=(int)n.charAt(i);
            max=Math.max(max,digit);
            if(max==57) break;
        }
        return max-48;
    }
}