bool isValid(char* s) {
    size_t length=strlen(s);
    char stack[length];
    int size=0;
    for(int i=0;i<length;i++){
        if(s[i]=='(' || s[i]=='{' || s[i]=='['){
            stack[size++]=s[i];
        }
        else{
            if(size==0) return false;
            else{
                if(s[i]==')' && stack[--size]!='('){
                    return false;
                }
                else if(s[i]=='}' && stack[--size]!='{'){
                    return false;
                }
                else if(s[i]==']' && stack[--size]!='['){
                    return false;
                }
            }
        }
    }
    if(size==0){
        return true;
    }
    return false;
}