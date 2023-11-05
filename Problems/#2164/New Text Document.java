class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<>(),l2=new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            if(i%2==0) l1.add(nums[i]);
            else l2.add(nums[i]);
        }
        Collections.sort(l1); Collections.sort(l2);
        int e=0,o=l2.size()-1;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i]=l1.get(e);
                e++;
            }
            else{
                nums[i]=l2.get(o);
                o--;
            }
        }  
        System.gc();
        return nums;      
    }
}