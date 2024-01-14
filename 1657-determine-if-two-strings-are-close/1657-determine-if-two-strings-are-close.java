class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int[] arr1=new int[26];
        for(int i=0;i<word1.length();i++){
            arr1[word1.charAt(i)-'a']++;
        }
        int[] arr2=new int[26];
        for(int i=0;i<word2.length();i++){
            arr2[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                if(arr1[i]==0 || arr2[i]==0){
                    return false;
                }
                else{
                    int find=arr2[i];
                    boolean flag=false;
                    for(int j=i+1;j<26;j++){
                        if(arr1[j]==find){
                            swap(arr1,i,j);
                            flag=true;
                            break;
                        }
                    }
                    if(flag==false){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}