class Solution {
    public int maxArea(int[] height) {
        //help form geeksforgeeks
//------> O(n^2)
        // int area=0;
        // for(int i=0; i<height.length; i++){
        //     for(int j=i+1; j<height.length; j++){
        //         area=Math.max(area, Math.min(height[i],height[j])*(j-i));
        //     }
        // }

//------> O(n) using two pointers concept, bruh! its not my code, hehe. 
        int left=0, right=height.length-1,area=0;
        while(left<right){
            int temp=Math.min(height[left],height[right])*(right-left);
            if(temp>area) area=temp;
            if(height[left]<height[right]) left++;
            else right--; //if(height[left]>=height[right])
        }
        System.gc(); // this is evil, SC went from 14% to 99%.
        return area;
    }
}


//------------------------------- revision ----------------------
class Solution {
    public int maxArea(int[] height) {
        int ans = 0, left = 0, right = height.length - 1;
        while (left < right) {
            ans = Math.max(ans, Math.min(height[left], height[right]) * (right-left));
            // if (height[left] < height[right]) left++;
            // else right--;
            if ( height[right]<height[left]) right--;
            else left++;
        }
        return ans;
    }
}