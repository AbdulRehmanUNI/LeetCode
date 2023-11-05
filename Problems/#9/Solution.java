class Solution {
    public boolean isPalindrome(int x) {

        if(x<0) return false;

        String num=Integer.toString(x);
        int s=0;
        int e=num.length()-1;

        while(s<=e){
            if(num.charAt(s)!=num.charAt(e)){
               return false;
            }
            s++;
            e--;
        }
        return true;
    }
}



// form leetcode sols , beats >99% on runtime

/*class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        
        return (x==rev || x==rev/10);
    } 
}*/