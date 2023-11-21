class Solution {
    public int countNicePairs(int[] nums) {
        int ans=0, mod= (int) 1e9+7;
        int rev[]=new int[nums.length];
        for(int i=0; i<rev.length; i++) rev[i]=nums[i]-rev(nums[i]);

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i: rev){
            if(hm.containsKey(i)){
                ans+=hm.get(i);
                ans%=mod;
            }
            else hm.put(i,0);
            hm.put(i,hm.get(i)+1);
        }
          
        return ans;
    }

    private int rev(int n) {
        int x = 0;
        while (n > 0) {
            x = x * 10 + (n % 10);
            n /= 10;
        }
    return x;
  }
}