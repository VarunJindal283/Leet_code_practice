class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int ans=0;
        for(int i=0;i<words.length;i++){
            String n="";
            for(int j=0;j<words[i].length();j++){
                int x=(int)(words[i].charAt(j)-'a');
                n=n+arr[x];
            }
            boolean flag=true;
            for(int k=0;k<ans;k++){
                if(n.equals(words[k])){
                    flag=false;
                    break;
                }
            }
            if(flag){
                words[ans]=n;
                ans++;
            }
        }
        return ans;
    }
}