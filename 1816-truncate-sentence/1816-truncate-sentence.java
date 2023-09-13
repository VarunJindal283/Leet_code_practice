class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        s=arr[0];
        for(int i=1;i<k;i++){
            s=s+" ";
            s=s+arr[i];
        }
        return s;
    }
}