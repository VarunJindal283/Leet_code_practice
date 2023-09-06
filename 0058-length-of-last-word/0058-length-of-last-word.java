class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        while(s.charAt(i)==' '){
            i--;
        }
        int first=i;
        while((i!=-1)){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
            i--;}
            else{break;}
        }
        return first-i;
    }
}