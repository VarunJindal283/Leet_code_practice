class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1'){
                    arr[i]+=Math.abs(j-i);
                }
            }
        }
        return arr;
    }
}