class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<deck.length; i++) q.offer(i);
        int res[]=new int[deck.length];
        int index=0;
        while(!q.isEmpty()){
            res[q.poll()]=deck[index++];
            if(!q.isEmpty()) q.offer(q.poll());
        }
        return res;
        
    }
}