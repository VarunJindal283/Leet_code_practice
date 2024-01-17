class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        int j=1;
        int k=2;
        int n1=0;
        int[] arr=new int[flowerbed.length+2];
        for(int p=1;p<flowerbed.length+1;p++){
            arr[p]=flowerbed[p-1];
        }
        while(k<flowerbed.length+2){
            if(arr[k]==0 && arr[i]==0 && arr[j]==0){
                i=i+2;
                j=j+2;
                k=k+2;
                n1++;
            }
            else{
                i++;
                k++;
                j++;
            }
        }
        if(n1>=n){
            return true;
        }
        return false;
    }
}