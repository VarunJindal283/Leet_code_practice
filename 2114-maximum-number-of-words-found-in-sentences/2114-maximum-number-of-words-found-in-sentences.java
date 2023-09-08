class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int ws=sentences[i].length();
            sentences[i]=sentences[i].replace(" ","");
            int s=sentences[i].length();
            int n=ws-s+1;
            if(max<n){
                max=n;
            }
        }
        return max;
    }
}