class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        s=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            if(arr[arr.length-i-1]!=" " && arr[arr.length-i-1]!=""){
                s=s+" "+arr[arr.length-i-1];
            }
        }
        return s;
    }
}