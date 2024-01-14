class Solution {
    public int mySqrt(int x) {
        return BSMS(x,0,46340);
    }
    public int BSMS(int x, int s,int e){
        if(s>e){
            return s-1;
        }
        int mid=((e-s)/2)+s;
        long mm=mid*mid;
        if((mm)==x){
            return mid;
        }
        if((mm)>x){
            return BSMS(x,s,mid-1);
        }
        return BSMS(x,mid+1,e);
    }
}