class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] check=new int[text2.length()+1][text1.length()+1];
        for(int i=0;i<text2.length();i++){
            Arrays.fill(check[i], -1);
        }
        return recuFunc(text1,text2,0,0,check);
    }
    public int recuFunc(String text1, String text2, int i, int j, int[][] check){
        if(j==text2.length() || i==text1.length()){
            return 0;
        }
        if(check[j][i]!=-1){
            return check[j][i];
        }
        int max=0;
        for(int p=j;p<text2.length();p++){
            int duli=i;
            char c=text2.charAt(p);
            while(duli<text1.length() && c!=text1.charAt(duli)){
                duli++;
            }
            if(duli<text1.length() && c==text1.charAt(duli)){
                int a=recuFunc(text1,text2,duli+1,p+1,check)+1;
                if(a>max){
                    max=a;
                }
            }
        }
        check[j][i]=max;
        return max;
    }
}