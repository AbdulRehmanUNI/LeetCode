class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circleCount=0, squareCount=0;
        for(int student: students){
            if(student==0) circleCount++;
            else squareCount++;
        }
        for(int sandwich: sandwiches){
            if(sandwich==0 && circleCount==0) return squareCount;
            else if(sandwich==1 && squareCount==0) return circleCount;
            if(sandwich==0) circleCount--;
            else squareCount--;
        }
        return 0;
    }
}