class Solution {
    public int countDigits(int num) {
        int n=0;
        int temp=num;
        while(temp>0){
            if(num%(temp%10)==0) n++;
            temp=temp/10;
        }
        return n;
    }
}