class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans=0;
        boolean flag=true;
        String newChars=chars;
        for(int i=0;i<words.length;i++){
            String t=words[i];
            int x=t.length();
            chars=newChars;
            flag=true;
            for(int j=0;j<t.length();j++){
                if(chars.contains(Character.toString(t.charAt(j)))==false){
                    flag=false;
                    break;
                }
                else{
                    for(int k=0;k<chars.length();k++){
                        if(chars.charAt(k)==t.charAt(j)){
                            chars=chars.substring(0,k)+chars.substring(k+1);
                            break;
                        }
                    }
                }
            }
            if(flag){
                ans=ans+x;
            }
        }
        return ans;
    }
}