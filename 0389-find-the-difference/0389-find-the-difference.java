class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr=s.toCharArray();
        char[] arr1=t.toCharArray();
        char ans=0;
        for(int i=0;i<s.length();i++){
            ans^=arr[i];
            ans^=arr1[i];
        }
        ans^=arr1[s.length()];
        return ans;
    }
}