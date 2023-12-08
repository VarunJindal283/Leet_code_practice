class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        if(n%2!=0){
            List<Integer> list=new ArrayList<>();
            if(n-2>=2 && isPrime(n-2)){
                list.add(2);
                list.add(n-2);
                ans.add(list);
            }
            return ans;
        }
        else{
            for(int i=1;i<=n/2;i++){
                if(isPrime(i) && isPrime(n-i)){
                    List<Integer> list=new ArrayList<>();
                    list.add(i);
                    list.add(n-i);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
    public boolean isPrime(int num){
        if(num<=1)
        {
            return false;
        }
        if(num>5){
            if(num%2==0){
            return false;
        }
        else if(num%3==0){
            return false;
        }
        else if(num%5==0){
            return false;
        }
        }
        
       for(int i=2;i<=Math.sqrt(num);i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}