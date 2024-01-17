class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                s=swap(s,i,j);
                i++;
                j--;
            }
            else if(isVowel(s.charAt(i))){
                j--;
            }
            else if(isVowel(s.charAt(j))){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return s;
    }
    public String swap(String s, int i, int j){
        char c1=s.charAt(i);
        char c2=s.charAt(j);
        String str=s.substring(0,i) + c2 + s.substring(i+1,j) + c1 + s.substring(j+1,s.length());
        return str;
    }
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
}