class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> mapCheck=new HashSet<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c)!=t.charAt(i)){
                    return false;
                }
            }
            else{
                if(mapCheck.contains(t.charAt(i))){
                    return false;
                }
                map.put(c,t.charAt(i));
                mapCheck.add(t.charAt(i));
            }
        }
        return true;
    }
}