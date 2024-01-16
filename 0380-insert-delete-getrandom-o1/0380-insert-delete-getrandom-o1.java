class RandomizedSet {
    
    HashSet<Integer> sett;
    
    public RandomizedSet() {
        this.sett=new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(sett.contains(val)){
            return false;
        }
        else{
            sett.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(sett.contains(val)){
            sett.remove(val);
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getRandom() {
        Integer[] arr=sett.toArray(new Integer[sett.size()]);
        int rand=(int)(Math.random()*arr.length);
        return arr[rand];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */