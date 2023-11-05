class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0; i<nums1.length; i++) list.add(nums1[i]);
        // for(int i=0; i<nums2.length; i++) list.add(nums2[i]);
        // Collections.sort(list);
        // return (list.size()%2==0) ? .5*( list.get(list.size()/2) + list.get((list.size()/2)-1)) : list.get(list.size()/2);
        int [] ans=new int[nums1.length + nums2.length];
        for(int i=0; i<nums1.length; i++) ans[i]=nums1[i];
        int j=0;
        for(int i=nums1.length; i<ans.length; i++){
             ans[i]=nums2[j];
             j++;
        }
        Arrays.sort(ans);
        return (ans.length%2==0) ? .5*(ans[ans.length/2] + ans[(ans.length/2)-1]) : ans[ans.length/2];
    }
}