class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int[] arr=new int[100001];

        for(int num: nums) arr[num]++;
        for(int i=0; i<arr.length; i++) if(arr[i]==2) ans.add(i);
        return ans;

    }
}