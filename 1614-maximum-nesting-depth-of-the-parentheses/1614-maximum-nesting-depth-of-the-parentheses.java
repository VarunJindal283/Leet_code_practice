class Solution {
    public int maxDepth(String s) {
        int size=0;
        int maxSize=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                size++;
            }
            else if(s.charAt(i)==')'){
                size--;
            }
            if(size>maxSize){
                maxSize=size;
            }
        }
        return maxSize;
    }
}