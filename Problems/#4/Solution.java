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

//--------------- revision ------------------
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) arr[k++] = nums1[i++];
            else arr[k++] = nums2[j++];
        }

        while (i < nums1.length) arr[k++] = nums1[i++];
        while (j < nums2.length) arr[k++] = nums2[j++];
        
        return arr.length % 2 == 0 ? (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0 : arr[arr.length / 2];
    }
}