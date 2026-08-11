int longestValidParentheses(char* s) {
    if(strlen(s)==0){
        return 0;
    }
    char stack[strlen(s)];
    int top=-1,i,c=0;
    for(i=0;s[i]!='\0';i++){
        if(s[i]=='('||s[i]=='['||s[i]=='{'){
            stack[++top]=s[i];
        }
        else if(s[i]==')'&& top!=-1 && stack[top]=='('){
            c++;
            top--;
        }
        else if(s[i]==')'&& top!=-1 && stack[top]!='('){
            stack[++top]=s[i];
        }
        else if(s[i]=='}'&& top!=-1 && stack[top]=='{'){
            c++;
            top--;
        }
        else if(s[i]=='}'&& top!=-1 && stack[top]!='{'){
            stack[++top]=s[i];
        }
        else if(s[i]==']'&& top!=-1 && stack[top]=='['){
            c++;
            top--;
        }
        else if(s[i]==']'&& top!=-1 && stack[top]!='['){
            stack[++top]=s[i];
        }
    }
    return c;
}
