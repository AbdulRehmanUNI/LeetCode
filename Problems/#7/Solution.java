class Solution {
  public int reverse(int x) {
    long ans = 0;

    while (x != 0) {
      ans = ans * 10 + x % 10;
      x /= 10;
    }

    return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
  }
}


//--------------------- revision ----------------------//

class Solution {
  public int reverse(int x) {
      boolean isNeg= x<0?true:false;
      if(isNeg) x=-(x);
      long ans=0;
      while(x>0){
          ans*=10;
          ans+= (x%10);
          x/=10;
      }
      ans= isNeg? -ans: ans;
      return (ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)? 0: (int) ans;  
  }
}
