class Solution {
    public String largestGoodInteger(String num) {
        int p1=0;
        int p2=1;
        int p3=2;
        String max="";
        for(int i=1;i<num.length()-1;i++){
            if(num.charAt(p1)==num.charAt(p2) && num.charAt(p2)==num.charAt(p3)){
                String ans=num.substring(p1,p3+1);
                if(max.equals("")){
                    max=ans;
                }
                else if(Integer.valueOf(ans)>Integer.valueOf(max)){
                    max=ans;
                }
            }
            p1++;
            p2++;
            p3++;
        }
        return max;
    }
}