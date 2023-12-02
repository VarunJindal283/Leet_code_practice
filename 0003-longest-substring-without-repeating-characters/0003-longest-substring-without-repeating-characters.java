class Solution {
    public int lengthOfLongestSubstring(String s) {
        String sub="";
        int ans=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(sub.contains(Character.toString(s.charAt(i)))==false){
                sub=sub+Character.toString(s.charAt(i));
                max++;
            }
            else{
                if(ans<max){
                    ans=max;
                }
                int x=i;
                for(int j=0;j<sub.length();j++){
                    if(s.charAt(i)==sub.charAt(j)){
                        x=i-sub.length()+j+1;
                    }
                }
                i=x;
                max=0;
                sub="";
                sub=sub+Character.toString(s.charAt(i));
                max++;
            }
        }
        if(ans<max){
            return max;
        }
        return ans;
    }
}