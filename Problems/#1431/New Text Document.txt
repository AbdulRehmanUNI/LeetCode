class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> l=new ArrayList<>();
        for(int i=0; i<candies.length; i++){

            boolean test=true;
            for(int j=0; j<candies.length; j++){
                if(candies[i]+extraCandies<candies[j] && i!=j) test=false; 
            }
            l.add(i,test);
        }
        return l;
    }
}