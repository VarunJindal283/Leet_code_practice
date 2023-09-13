class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String t="";
        for(int i=0;i<words.size();i++){
            t=t+words.get(i).charAt(0);
            if(!(s.contains(t))){
                return false;
            }
        }
        if(t.equals(s)){
            return true;
        }
        return false;
    }
}