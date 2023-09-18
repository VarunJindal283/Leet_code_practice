class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(ispalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public boolean ispalindrome(String word){
        for(int j=0;j<word.length()/2;j++){
            if(!(word.charAt(j)==word.charAt(word.length()-j-1))){
                return false;
            }
        }
        return true;
    }
}