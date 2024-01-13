class Solution {
    public void reverseString(char[] s) {
        RS(s,0);
    }
    public void RS(char[] s,int i){
        if(i==(s.length/2)){
            return;
        }
        swap(i,s.length-1-i,s);
        RS(s,i+1);
    }
    public void swap(int a,int b,char[] s){
        char temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }
}