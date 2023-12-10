class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int s=groupSizes.length;
        int[] arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=i;
        }
        for(int i=0;i<s;i++){
            for(int j=1;j<s-i;j++){
                if(groupSizes[j-1]>groupSizes[j]){
                    int temp=groupSizes[j];
                    groupSizes[j]=groupSizes[j-1];
                    groupSizes[j-1]=temp;
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            int n=groupSizes[i];
            List<Integer> list=new ArrayList<>();
            while(n!=0){
                list.add(arr[i]);
                i++;
                n--;
            }
            ans.add(list);
            i--;
        }
        return ans;
    }
}