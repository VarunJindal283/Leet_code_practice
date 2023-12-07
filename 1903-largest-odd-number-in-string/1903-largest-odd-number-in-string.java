class Solution {
    public String largestOddNumber(String num) {
        int i=0;
        while(num.length()>0){
            int rem=Integer.valueOf(num.charAt(num.length()-i-1));
            if(rem%2!=0){
                return num;
            }
            num=num.substring(0,num.length()-1-i);
        }
        return "";
    }
}