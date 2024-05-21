class MyHashSet {
    boolean[] map= new boolean[1000001];
    public MyHashSet() {
        this.map=map;
    }
    
    public void add(int key) {
        this.map[key]=true;
    }
    
    public void remove(int key) {
        this.map[key]=false;
    }
    
    public boolean contains(int key) {
        return this.map[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */