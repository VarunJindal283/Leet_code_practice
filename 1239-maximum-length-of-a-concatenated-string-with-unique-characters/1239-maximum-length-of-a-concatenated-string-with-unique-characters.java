class Solution {
    public int maxLength(List<String> arr) {
        return recuLength(arr,"",0);
    }
    public int recuLength(List<String> arr,String check,int i){
        if(i==arr.size()){
            return check.length();
        }
        int max=0;
        for(int j=i;j<arr.size();j++){
            String str=arr.get(j);
            boolean flag=true;
            String newCheck=new String(check);
            for(int p=0;p<str.length();p++){
                if(newCheck.contains(Character.toString(str.charAt(p)))){
                    flag=false;
                    int nc=check.length();
                    if(max<nc){
                        max=nc;
                    }
                    break;
                }
                else{
                    newCheck=newCheck+str.charAt(p);
                }
            }
            if(flag){
                int n=recuLength(arr,check+str,j+1);
                if(n>max){
                    max=n;
                }
            }
        }
        return max;
    }
}