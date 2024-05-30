class Solution {
    public int countTriplets(int[] arr) {
        int ans=0;
        for(int i=0; i<arr.length; i++){
            int a=arr[i];
            for(int k=i+1; k<arr.length; k++){
                a^=arr[k];
                if(a==0) ans+=k-i;
            }
        }
        return ans;
        
    }
}