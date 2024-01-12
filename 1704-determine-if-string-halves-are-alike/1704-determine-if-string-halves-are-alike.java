class Solution {
    public boolean halvesAreAlike(String s) {
        int middle=s.length()/2;
        int check=0;
        for(int i=0;i<middle;i++){
            if(isVowel(s.charAt(i))){
                check++;
            }
            if(isVowel(s.charAt(middle+i))){
                check--;
            }
        }
        if(check==0){
            return true;
        }
        return false;
    }
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
}