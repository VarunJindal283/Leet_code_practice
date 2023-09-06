class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int x=needle.length();
            for(int i=0;i<haystack.length();i++){
                int flag=0;
                if((haystack.charAt(i)==(needle.charAt(0)))){
                    flag=1;
                for(int j=1;j<x;j++){
                    if((haystack.charAt(i+j)!=(needle.charAt(j)))){
                        flag=0;
                    }
                }
                    if(flag==1){
                        return i;
                    }
            }
        }
       
    }
         return -1;
}}