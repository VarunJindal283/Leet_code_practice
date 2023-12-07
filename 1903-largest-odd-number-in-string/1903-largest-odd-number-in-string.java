class Solution {
    public String largestOddNumber(String num) {
        int i=0;
        while(num.length()>i){
            int rem=(int)(num.charAt(num.length()-i-1));
            if(rem%2!=0){
                return num.substring(0,num.length()-i);
            }
            i++;
        }
        return "";
    }
}