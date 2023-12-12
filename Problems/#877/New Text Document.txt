class Solution {
    public boolean stoneGame(int[] piles) {
        int l=0,r=piles.length-1,alice=0,bob=0;
        Arrays.sort(piles);
        while(l<r){
            if(piles[l]>piles[r]) alice+=piles[l++];
            else alice+=piles[r--];
            if(piles[l]>piles[r]) bob+=piles[l++];
            else bob+=piles[r--];
        }
        return alice>bob;
    }
}