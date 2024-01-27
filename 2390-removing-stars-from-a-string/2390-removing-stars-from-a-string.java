class Solution {
    public String removeStars(String s) {
        StringBuilder str=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*' && j!=0){
                str.deleteCharAt(--j);
            }
            else if(s.charAt(i)!='*'){
                str.append(s.charAt(i));
                j++;
            }
        }
        return str.toString();
    }
}