class Solution {
    public int minimumSum(int num) {

        int [] ans=new int[4];
       for(int i=0; num>0; i++){
           ans[i]=num%10;
           num=num/10;
       }

        Arrays.sort(ans);


        return (ans[0]*10+ans[2])+(ans[1]*10+ans[3]) ;

        
    }
}