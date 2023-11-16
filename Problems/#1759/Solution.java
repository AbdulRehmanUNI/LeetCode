class Solution {
  public int countHomogenous(String s) {
    final int kMod = 1_000_000_007;
    int ans = 0;
    int count = 0;
    char currentChar = '@';

    for (final char c : s.toCharArray()) {
      count = c == currentChar ? count + 1 : 1;
      currentChar = c;
      ans += count;
      ans %= kMod;
    }

    return ans;
  }
}

// class Solution {
//     public int countHomogenous(String s) {
//         int ans = 0, len = s.length(), mod = (int)1e9 + 7,j=0,count=0;

//         for (int i = 0; i < len; i++) {
//             j=i;
//             if(s.charAt(i)==s.charAt(j)){
//                 count++;
//                 j++;
//             }
//             else count=1;
//             i=j-1;
//             ans+=count;
//             ans%=mod;
//         }
//         return ans;
//     }
// }
// class Solution {
//     public int countHomogenous(String s) {
//         int ans=0,len=s.length();

//         for(int i=0; i<len; i++){
//             for(int j=i; j<len; j++){
//                 if(s.charAt(i)==s.charAt(j)) ans++;
//             }
//         }
//         return ans%((int)Math.pow(10,9)+7);
//     }
// }
