class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        for(int i=0; i<s.length() ; i++){
            int temp=test(s,i,s.length());
            if (temp>ans) ans=temp;
        }
        return ans;
        
    }
    public int test(String s, int start, int end){
        int ans=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=start; i<end; i++){
            if(hs.contains(s.charAt(i))) return ans;
            else ans++;
            hs.add(s.charAt(i));         
        }
        return ans;
    }
}



// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int left=0, ans=0;
//         int freq[]=new int[128];

//         for(int right=0; right<s.length(); right++){
//             freq[s.charAt(right)]++;

//             while(test(freq)){
//                 freq[s.charAt(left)]--;
//                 left++;
//             }
//             ans=Math.max(ans, right-left+1);
//         }
//         return ans;
        
//     }
//     public static boolean test(int [] freq){
//         for(int num:freq) if(num>1) return true;
//         return false;
//     }
// }


// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int left=0, ans=0;
//         int freq[]=new int[128];

//         for(int right=0; right<s.length(); right++){
//             freq[s.charAt(right)]++;

//             while(test(freq)){
//                 freq[s.charAt(left)]--;
//                 left++;
//             }
//             ans=Math.max(ans, right-left+1);
//         }
//         return ans;
        
//     }
//     public static boolean test(int [] freq){
//         for(int num:freq) if(num>1) return true;
//         return false;
//     }
// }