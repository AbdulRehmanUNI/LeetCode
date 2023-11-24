class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans=0,len=piles.length;
        int bob=0,me=len-2,alice=len-1;
        //bob will always get the lowest one

        for(int i=0; i<len/3; i++){
            ans+=piles[me];
            me-=2; // bob++; alice-=2;
        }  
        return ans;
    }
}

//dylan smith
// class Solution {
//     public int maxCoins(int[] piles) {
//         Arrays.sort(piles);
//         int res = 0;
//         for (int i = 0; i < piles.length / 3; i++) {
//             res += piles[piles.length - 2 - 2 * i];
//         }
//         return res;
//     }
// }