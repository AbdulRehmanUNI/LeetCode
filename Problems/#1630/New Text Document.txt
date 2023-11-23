class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Boolean> ans=new ArrayList<>();
        for(int i=0; i<l.length; i++) ans.add(check(nums,l[i],r[i]));
        return ans;
    }
    private boolean check(int[] nums, int l, int r){
        int[] temp=new int[r-l+1];
        int index=0;
        for(int i=l; i<=r; i++) temp[index++]=nums[i];
        Arrays.sort(temp);
        for(int i=2; i<temp.length; i++) {
            if(temp[1]-temp[0]!=temp[i]-temp[i-1]) return false; 
        }
        return true;
    }

}