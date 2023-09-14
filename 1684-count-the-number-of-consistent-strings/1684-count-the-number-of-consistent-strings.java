class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        for(int i=0;i<allowed.length();i++){
            String x=Character.toString(allowed.charAt(i));
            for(int j=0;j<words.length;j++){
                words[j]=words[j].replace(x,"");
            }
        }
        for(int i=0;i<words.length;i++){
            if(words[i].length()==0){
                ans++;
            }
        }
        return ans;
    }
}