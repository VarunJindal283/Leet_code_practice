class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        int x=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                ans=ans+list.get(x);
                x++;
            }
            else{
                ans=ans+s.charAt(i);
            }
        }
        return ans;
    }
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
}