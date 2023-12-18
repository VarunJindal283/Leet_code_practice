int minAddToMakeValid(char* s) {
    size_t n=strlen(s);
    int count=0;
    int ans=0;
    for(int i=0;i<n;i++){
        if(s[i]=='('){
            ans++;
        }
        else{
            ans--;
        }
        if(ans<0){
            count++;
            ans=0;
        }
    }
    return count+ans;
}