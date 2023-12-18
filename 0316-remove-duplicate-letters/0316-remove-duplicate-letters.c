char* removeDuplicateLetters(char* s) {
    int index[26];
    bool check[26]={0};
    size_t n=strlen(s);
    char stack[n];
    stack[0]=s[0];
    int size=0;
    check[(int)s[0]-(int)'a']=1;
    for(int i=0;i<n;i++){
        index[(int)s[i]-(int)'a']=i;
    }
    for(int i=1;i<n;i++){
        if(check[(int)s[i]-(int)'a']==0){
        if(stack[size]<s[i]){
            
                stack[++size]=s[i];
                check[(int)s[i]-(int)'a']=1;
                
            }
        else{
            while(size>-1 && stack[size]>s[i] && index[(int)stack[size]-(int)'a']>i){
                // printf("%d",check[1]);
                check[(int)stack[size]-(int)'a']=0;
                size--;
            }
            stack[++size]=s[i];
            check[(int)s[i]-(int)'a']=1;
            // printf("%c",s[i]);
            }
        }
        }
    for(int i=0;i<size+1;i++){
        s[i]=stack[i];
    }
    s[size+1]='\0';
    return s;
}