class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int lowl=Integer.toString(low).length();
        int temp=lowl-1;
        int nadd=1;
        while(temp>0){
            nadd=(nadd*10)+1;
            temp--;
        }
        List<Integer> list=new ArrayList<>();
        int currn=num(lowl);
        while(currn<=high){
            if(currn>=low){
                list.add(currn);
            }
            if(currn%10==9){
                lowl++;
                currn=num(lowl);
                nadd=(nadd*10)+1;
            }
            else{
                currn=currn+nadd;
            }
        }
        return list;
    }
    public int num(int len){
        int ans=0;
        int add=1;
        while(len>0){
            ans=(ans*10)+add;
            len--;
            add++;
        }
        return ans;
    }
}