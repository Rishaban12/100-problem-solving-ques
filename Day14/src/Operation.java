import java.util.Stack;

public class Operation {
    public static void main(String[] args) {
        String s="0-212345678";
        Stack<Integer> st=new Stack<>();
        char sign='+';
        int n=0;

        for(int i=0;i<s.length();i++)  {
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                n=(n*10)+(ch-'0');
            }
            if((!Character.isDigit(ch) && ch!=' ')||i==s.length()-1){
                if(sign=='+') st.push(n);
                else if(sign=='-') st.push(-n);
                else if(sign=='*') st.push(st.pop()*n);
                else st.push(st.pop()/n);

                sign=ch;
                n=0;
            }
        }
        n=0;
        while(!st.isEmpty()) n+=st.pop();

        System.out.println(n);
    }
}
