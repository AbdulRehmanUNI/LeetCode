class Solution {
    public int numberOfWays(String corridor) {
        int x=1, y=0, z=0, mod=(int) 1e9+7;
        for(char c:corridor.toCharArray()){
            if(c=='S'){
                x=(x+z)%mod;
                z=y;
                y=x;
                x=0;
            }
            else x=(x+z)%mod;
        }
    return z;
    }
}