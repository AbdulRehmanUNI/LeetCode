class MyHashMap {
    private List<Pair> map;
    public MyHashMap() {
        map=new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for(Pair pair: map){
            if(pair.getKey()==key) {
                pair.setValue(value);
                return;
            } 
        }
        map.add(new Pair(key,value));
    }
    
    public int get(int key) {
        for(Pair pair: map){
            if(pair.getKey()==key) return pair.getValue();
        }
        return -1;
    }
    
    public void remove(int key) {
        for(Pair pair: map){
            if(pair.getKey()==key) {
                map.remove(pair);
                return;
            }
        }
    }
}

class Pair{
   private int key,value;
   public Pair(int key, int value){
       this.key=key;
       this.value=value;
   }
    public int getKey() {return key;}
    public int getValue() {return value;}
    public void setValue(int value) {this.value=value;}
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */