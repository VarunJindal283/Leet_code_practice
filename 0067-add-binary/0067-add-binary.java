class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        String ans="";
        int bl=b.length();
        int al=a.length();
        int i=0;
        while(a.length()>i || b.length()>i){
            if(a.length()<=i){
                if(carry==1 && b.charAt(bl-1-i)=='1'){
                    ans='0'+ans;
                    carry=1;
                }
                else if(carry==0 && b.charAt(bl-1-i)=='0'){
                    ans='0'+ans;
                    carry=0;
                }
                else{
                    ans='1'+ans;
                    carry=0;
                }
            }
            else if(b.length()<=i){
                if(carry==1 && a.charAt(al-1-i)=='1'){
                    ans='0'+ans;
                    carry=1;
                }
                else if(carry==0 && a.charAt(al-1-i)=='0'){
                    ans='0'+ans;
                    carry=0;
                }
                else{
                    ans='1'+ans;
                    carry=0;
                }
            }
            else{
                if(a.charAt(al-1-i)=='1' && b.charAt(bl-1-i)=='1'){
                    if(carry==1){
                        ans='1'+ans;
                        carry=1;
                    }
                    else{
                        ans='0'+ans;
                        carry=1;
                    }
                }
                else if(a.charAt(al-1-i)=='0' && b.charAt(bl-1-i)=='0'){
                    if(carry==1){
                        ans='1'+ans;
                        carry=0;
                    }
                    else{
                        ans='0'+ans;
                        carry=0;
                    }
                }
                else{
                    if(carry==1){
                        ans='0'+ans;
                        carry=1;
                    }
                    else{
                        ans='1'+ans;
                        carry=0;
                    }
                }
            }
            i++;
        }
        if(carry==1){
            ans='1'+ans;
        }
        return ans;
    }
}