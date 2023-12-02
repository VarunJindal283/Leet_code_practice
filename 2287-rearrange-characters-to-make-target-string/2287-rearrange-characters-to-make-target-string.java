class Solution {
    public int rearrangeCharacters(String s, String target) {
        if(target.length()>s.length()){
            return 0;
        }
        int ans=s.length();
        int x=0;
        for(int i=0;i<target.length();i++){
            int o=0;
            for(int k=i+1;k<target.length();k++){
                if(target.charAt(i)==target.charAt(k)){
                    o++;
                }
            }
            x=o;
            char c=target.charAt(i);
            int min=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c){
                    min++;
                }
            }
            min=min/(o+1);
            if(ans>min){
                ans=min;
            }
            target=target.replaceAll(Character.toString(c),"");
            target="1"+target;
        }
        return ans;
    }
}