class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans=0, cost=0, j=0;

        for(int i=0; i<s.length(); i++){
            cost+=Math.abs(s.charAt(i) - t.charAt(i));
            while( j<=i && cost>maxCost){
                cost-=Math.abs(s.charAt(j) - t.charAt(j++));
            }
            ans=Math.max(ans, i-j+1); // size of current window
        }
        return ans;
    }
}


// class Solution {
//     public int equalSubstring(String s, String t, int maxCost) {
//         int[] arr= new int[s.length()+1];
//         for(int i=0; i<s.length(); i++){
//             arr[i]=Math.abs(s.charAt(i)-t.charAt(i));
//         }
//         int j=0;
//         int cost=0, ans=0;
//         for(int i=0; i<arr.length; i++){
//             cost+=arr[i];
//             while( j<=i && cost>maxCost){
//                 cost-=arr[j++];
//             }
//             ans=Math.max(ans, i -j +1);
//         }
//         return ans;
//     }
// }