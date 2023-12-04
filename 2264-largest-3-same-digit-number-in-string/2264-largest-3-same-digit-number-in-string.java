class Solution {
    public String largestGoodInteger(String num) {
        int p1=0;
        int p3=2;
        String max="";
        for(int i=1;i<num.length()-1;i++,p1++,p3++){
            if(num.charAt(p1)==num.charAt(i) && num.charAt(i)==num.charAt(p3)){
                String ans=num.substring(p1,p3+1);
                if(max.equals("") || Integer.valueOf(ans)>Integer.valueOf(max)){
                    max=ans;
                }
            }
        }
        return max;
    }
}