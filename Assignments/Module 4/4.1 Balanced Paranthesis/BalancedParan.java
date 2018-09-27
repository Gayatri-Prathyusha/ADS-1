class BalancedParan  {
    BalancedParan() {

    }
    public class stack  
    {
        int top=-1; 
        char items[] = new char[100]; 
        void push(char x) { 
            if (top == 99) { 
                System.out.println("Stack full"); 
            } else { 
                items[++top] = x; 
            } 
        } 
        char pop() { 
            if (top == -1) { 
                System.out.println("Underflow error"); 
                return '\0';
            } else { 
                char element = items[top]; 
                top--; 
                return element; 
            } 
        }          
        boolean isEmpty() { 
            return (top == -1) ? true : false;
        } 
    }
    public boolean isMatchingPair(char character1, char character2) { 
        if (character1 == '(' && character2 == ')') 
            return true; 
        else if (character1 == '{' && character2 == '}') 
            return true; 
        else if (character1 == '[' && character2 == ']') 
            return true; 
        else
            return false; 
    }
    public boolean areParenthesisBalanced(char exp[]) {
        stack st=new stack();
        for(int i=0;i<exp.length;i++) {
            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
                st.push(exp[i]); 
            if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') { 
            if (st.isEmpty()) { 
                return false; 
            } else if ( !isMatchingPair(st.pop(), exp[i]) ) { 
                return false; 
            } 
        } 
    } 
    if (st.isEmpty()) {
        return true;
    }
    else {   
        return false; 
    }  
}
}
