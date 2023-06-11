class Solution { 
    public static void main(String [] args){
        System.out.println(romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {
        s= s.toUpperCase();
        int num=0;
        for(int i=0; i< s.length(); i++){
            
            if(s.charAt(i)=='I'){
                num+=1;
            }//if
            else if(s.charAt(i)=='V'){
                num+=5;
                if((i-1)>=0 && i>0){
                if(s.charAt(i-1)=='I') num-=1;
                }
            }
             else if(s.charAt(i)=='X'){
                num+=10;
                if((i-1)>=0 && i>0){
                if(s.charAt(i-1)=='I') num-=1;
                }
            }
             else if(s.charAt(i)=='L'){
                num+=50;
                if((i-1)>=0 && i>0){
                if(s.charAt(i-1)=='X'  ) num-=10;
                }
            }
             else if(s.charAt(i)=='C'){
                num+=100;
                if((i-1)>=0 && i>0){
                if(s.charAt(i-1)=='X') num-=10;
                }
            }
             else if(s.charAt(i)=='D'){
                num+=500;
                if((i-1)>=0 && i>0){
                if(s.charAt(i-1)=='C') num-=100;
                }
            }

             else if(s.charAt(i)=='M'){
                if((i-1)>=0 && i>0){
                if(s.charAt(i-1)=='C') num-=100; 
             }
             num+=1000;
             
            }//if
        }//for
        return num;
    }
}





/*
// the solution from the CP of Sir Muizz the great

String s=a.toUpperCase();
    int sum = 0;
    HashMap<Character, Integer> h = new HashMap<>();
    h.put('I', 1);
    h.put('V', 5);
    h.put('X', 10);
    h.put('L', 50);
    h.put('C', 100);
    h.put('D', 500);
    h.put('M', 1000);

    for (int i = 0; i < s.length(); i++) {
        int val = h.get(s.charAt(i));
        if (i != s.length() - 1) {
            int valNext = h.get(s.charAt(i+1));
            if (valNext > val) {
                sum += valNext - val;
                i++;
            } 
            else sum += val;
        } 
        else sum += val;
     
    }
    return sum;
}
*/