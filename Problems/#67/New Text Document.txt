class Solution {
    public String addBinary(String a, String b) {
    //    int carry=0, i=a.length()-1, j=b.length()-1;
    //     String ans="";
    //    while(i>=0 || j>=0 || carry==1){
    //        if(i>=0) carry+=a.charAt(i--)- '0';
    //        else if(j>=0) carry+=b.charAt(j--)- '0';
    //        ans= carry%2 +ans;
    //        carry/=2;
    //    }
    //     return ans;
    String sb = new String();
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) {
      if (i >= 0)
        carry += a.charAt(i--) - '0';
      if (j >= 0)
        carry += b.charAt(j--) - '0';
      sb=carry%2+sb;
      carry /= 2;
    }
    return sb;
       }
}