class Solution {
    public boolean isHappy(int n) {
        int f=n;
        int s=n;
        do{
            f=sumofsquare(sumofsquare(f));
            s=sumofsquare(s);
        }while(s!=f);
        if(s==1){
            return true;
        }
        return false;
    }
    public int sumofsquare(int x){
        int ans=0;
        while(x>0){
            ans=ans+(x%10)*(x%10);
            x=x/10;
        }
        return ans;
    }
}