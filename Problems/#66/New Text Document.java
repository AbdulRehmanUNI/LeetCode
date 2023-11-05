class Solution {
    public int[] plusOne(int[] digits) {
    int carry=0;
    for (int i = digits.length - 1; i >= 0; i--) {  
      if (digits[i]>=0 && digits[i]<=8) {
        ++digits[i];
        carry=0;
        break;
      }
      else{
           digits[i]=0;
           carry=1;
      } 
    }
    if(carry!=1) return digits;
    else {
        int arr[]=new int [digits.length+1];
        arr[0]=1;
        Arrays.fill(arr,1,arr.length,0);
        return arr;
    }
    }
}