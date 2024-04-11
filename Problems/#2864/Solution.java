class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr=s.toCharArray();
        int count=0;
        for(char c: arr) if(c=='1') count++;
        if(count==0) return s;
        Arrays.fill(arr,'0');
        arr[arr.length-1]='1';
        count--;
        int i=0;
        while(count-->0) arr[i++]='1';
        return String.valueOf(arr);
    }
}