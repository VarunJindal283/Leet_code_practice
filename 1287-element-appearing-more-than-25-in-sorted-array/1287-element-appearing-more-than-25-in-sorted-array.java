class Solution {
    public int findSpecialInteger(int[] arr) {
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                if(count>(float)(arr.length/(float)4)){
                    return arr[i-1];
                }
                count=1;
            }
            else{
                count++;
            }
        }
        if(count>(float)(arr.length/(float)4)){
            return arr[arr.length-1];
        }
        return 0;
    }
}