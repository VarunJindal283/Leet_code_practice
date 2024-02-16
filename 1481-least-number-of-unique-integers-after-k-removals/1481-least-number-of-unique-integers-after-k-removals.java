class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int[] oarr=new int[map.size()];
        int i=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            oarr[i]=entry.getValue();
            i++;
        }
        Arrays.sort(oarr);
        int j=0;
        while(j!=oarr.length && k>=0){
            k=k-oarr[j];
            j++;
        }
        if(j==oarr.length && k>=0){
            return 0;
        }
        else{
            return oarr.length-j+1;
        }
    }
}