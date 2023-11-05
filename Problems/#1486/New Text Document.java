class Solution {
    public int xorOperation(int n, int start) {
        int []ans =new int[n];
        for(int i=0; i<n; i++){
            ans[i]=start+2*i;
        }
        int res=ans[0];
        for(int i=1; i<n ;i++) res^=ans[i];
        return res;
    }
}