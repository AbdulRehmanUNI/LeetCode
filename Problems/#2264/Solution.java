class Solution {
    public String largestGoodInteger(String num) {
        if(num.contains("999")) return "999";
        else if(num.contains("888")) return "888";
        else if(num.contains("777")) return "777";
        else if(num.contains("666")) return "666";
        else if(num.contains("555")) return "555";
        else if(num.contains("444")) return "444";
        else if(num.contains("333")) return "333";
        else if(num.contains("222")) return "222";
        else if(num.contains("111")) return "111";
        else if(num.contains("000")) return "000";
        else return "";      
    }
}

//walkccc

// class Solution {
//   public String largestGoodInteger(String num) {
//     String ans = "";

//     for (int i = 2; i < num.length(); ++i)
//       if (num.charAt(i - 2) == num.charAt(i - 1) && num.charAt(i - 1) == num.charAt(i) &&
//           num.substring(i - 2, i + 1).compareTo(ans) > 0)
//         ans = num.substring(i - 2, i + 1);

//     return ans;
//   }
// }
