class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks);
        Collections.sort(processorTime);
        int ans=0,index=tasks.size()-1;
        
        for(int i=0; i<processorTime.size(); i++){
                ans=Math.max(ans, (processorTime.get(i) +tasks.get(index)));
                index-=4;           
        }
        return ans;
        
    }
}