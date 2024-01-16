class Solution {
    public int partitionString(String s) {
        int ans=0;
        int i=0;
        int last=0;
        String str="";
        while(i<s.length()){
            char c=s.charAt(i);
            if(s.substring(last,i).contains(Character.toString(c))){
                ans++;
                str="";
                last=i;
            }
            else{
                str=str+c;
                i++;
            }
        }
        return ans+1;
    }
}