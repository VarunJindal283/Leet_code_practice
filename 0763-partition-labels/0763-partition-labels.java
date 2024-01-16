class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> list=new ArrayList<>();
        int j=0;
        int i=0;
        int last=0;
        while(i<s.length()){
            char c=s.charAt(j);
            String str=s.substring(i,s.length());
            if(str.contains(Character.toString(c))){
                i++;
            }
            else{
                j++;
            }
            if(i==j){
                list.add(i-last);
                last=i;
            }
        }
        list.add(s.length()-last);
        return list;
    }
}