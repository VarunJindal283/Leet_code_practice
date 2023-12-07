class Solution {
    public String largestOddNumber(String num) {
        int i=num.length() - 1;
        while(i >= 0){
            int rem=(int)(num.charAt(i));
            if(rem%2!=0){
                return num.substring(0,i + 1);
            }
            i--;
        }
        return "";
    }
}