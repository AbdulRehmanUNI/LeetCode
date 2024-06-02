class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;

        while(start<end){
          char temp=s[start];
          s[start]=s[end];
          s[end]=temp;
          start++;
          end--;
        }
        
    }
}

// 2 june 2024, POTD

class Solution {
    public void reverseString(char[] s) {
        int start=0, end=s.length-1;
        while(start<end){
            char one=s[start];
            s[start++]=s[end];
            s[end--]=one;
        }
    }
}
