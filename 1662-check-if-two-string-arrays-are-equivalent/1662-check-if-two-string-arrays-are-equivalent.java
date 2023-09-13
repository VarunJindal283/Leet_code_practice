class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a1="";
        String a2="";
        if(word1.length==1){
            a1=a1+word1[0];
        }
        else if(word1.length>1){
            for(int i=0;i<word1.length;i++){
                a1=a1+word1[i];
            }
        }
        if(word2.length==1){
            a2=a2+word2[0];
        }
        else if(word2.length>1){
            for(int i=0;i<word2.length;i++){
                a2=a2+word2[i];
            }
        }
        if(a1.equals(a2)){
            return true;
        }
        return false;
    }
}