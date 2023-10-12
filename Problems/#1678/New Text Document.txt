class Solution {
    public String interpret(String command) {
        String s="";

        for(int i=0;i<command.length(); i++){
            if(command.charAt(i)=='G') s+=command.charAt(i);
            if(i+1<command.length()) 
                if(command.charAt(i)=='(' && command.charAt(i+1)==')') s+="o";
            if(i+3<command.length()) 
                if(command.charAt(i)=='(' && command.charAt(i+1)=='a' && command.charAt(i+2)=='l' && command.charAt(i+3)==')') s+="al";
        }
        return s;
    }
}

// class Solution {
//     public String interpret(String command) {
//         String str1 = command.replace("()", "o");
//         String str2 = str1.replace("(al)", "al");
//         return str2;
//     }
// }