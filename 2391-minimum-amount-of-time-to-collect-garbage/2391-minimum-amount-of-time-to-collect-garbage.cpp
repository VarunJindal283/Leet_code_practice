class Solution {
public:
    int garbageCollection(vector<string>& garbage, vector<int>& travel) {
        int count =0;
          int index=0;

        for(int i =0; i<garbage.size() ; i++){
            for(int j =0; j<garbage[i].size() ; j++){
                char ch = garbage[i][j];

                if(ch=='M'){
                    count+=1;
                    index=i;
                }
            }


        }
        for(int i=0;i<index;i++){
            count=count+travel[i];
        }
        index=0;
        for(int i =0; i<garbage.size() ; i++){
            for(int j =0; j<garbage[i].size() ; j++){
                char ch = garbage[i][j];

                if(ch=='P'){
                    count+=1;
                    index=i;

                }
            }
        }
        for(int i=0;i<index;i++){
            count=count+travel[i];
        }
        index=0;
        for(int i =0; i<garbage.size() ; i++){
            for(int j =0; j<garbage[i].size() ; j++){
                char ch = garbage[i][j];

                if(ch=='G'){
                    count+=1;
                    index=i;

                }
            }

        }
        for(int i=0;i<index;i++){
            count=count+travel[i];
        }
        return count;
    }
};