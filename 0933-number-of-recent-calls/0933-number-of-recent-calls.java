class RecentCounter {
    
    ArrayList<Integer> list;

    public RecentCounter() {
        this.list=new ArrayList<>();
    }
    
    public int ping(int t) {
        int upper=t;
        int lower=t-3000;
        int ans=0;
        list.add(t);
        for(int i=0;i<list.size();i++){
            if(list.get(list.size()-i-1)<=upper && list.get(list.size()-i-1)>=lower){
                ans++;
            }
        }
        return ans;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */