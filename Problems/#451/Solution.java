class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128]; 
        for(char c: s.toCharArray()) freq[c]++;

        char[] ans = new char[s.length()];
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            int character = getLargest(freq);
            int freq1 = freq[character];
            while(freq1 > 0){
                ans[count++] = (char) character;
                freq1--;
            }
            freq[character] = 0;
        }
        return new String(ans);
    }

    public int getLargest(int[] nums){
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}