class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int ans=0;
        for(int num: nums){
            String n=Integer.toString(num);
            char max='0';
            String number="";
            for(char c: n.toCharArray()) if(c>max) max=c;
            for(char c: n.toCharArray()) number+=max;
            ans+=Integer.parseInt(number);
        }
        return ans;
        
        
    }
}