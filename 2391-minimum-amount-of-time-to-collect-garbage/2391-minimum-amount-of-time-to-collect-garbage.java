class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans=0;
        int f=0;
        for(int i=0;i<garbage.length;i++){
            if(garbage[i].contains("P")){
                f=i;
                for(int j=0;j<garbage[i].length();j++){
                    if(garbage[i].charAt(j)=='P'){
                        ans++;
                    }
                }
            }
        }
        for(int i=0;i<f;i++){
            ans=ans+travel[i];
        }
        f=0;
        for(int i=0;i<garbage.length;i++){
            if(garbage[i].contains("G")){
                f=i;
                for(int j=0;j<garbage[i].length();j++){
                    if(garbage[i].charAt(j)=='G'){
                        ans++;
                    }
                }
            }
        }
        for(int i=0;i<f;i++){
            ans=ans+travel[i];
        }
        f=0;
        for(int i=0;i<garbage.length;i++){
            if(garbage[i].contains("M")){
                f=i;
                for(int j=0;j<garbage[i].length();j++){
                    if(garbage[i].charAt(j)=='M'){
                        ans++;
                    }
                }
            }
        }
        for(int i=0;i<f;i++){
            ans=ans+travel[i];
        }
        return ans;
    }
}