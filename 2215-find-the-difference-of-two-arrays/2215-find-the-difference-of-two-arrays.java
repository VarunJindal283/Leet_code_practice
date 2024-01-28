class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set1.add(nums2[i]);
        }
        List<Integer> list2=new ArrayList<>(set1);
        for(int i=0;i<list2.size();i++){
            if(set.contains(list2.get(i))){
                set.remove(list2.get(i));
                list2.remove(i);
                i--;
            }
        }
        List<Integer> list1=new ArrayList<>(set);
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}