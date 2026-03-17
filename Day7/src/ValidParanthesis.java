import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s="(*))";
        /*Stack<Character> stack=new Stack<>();
        int count=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                stack.push(ch);
        }
        int out=0;
        while(!stack.isEmpty()){
            if(stack.peek()==')'){
                stack.pop();
                out++;
            }
            else if(stack.peek()=='*'){
                stack.pop();
                if(!stack.isEmpty() && stack.peek()=='(' && out>=2 && stack.size()<out){
                    //stack.pop();
                    out--;
                    count+=2;
                }else if(!stack.isEmpty() && stack.peek()==')'){
                    out++;
                }else if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                    count+=2;
                }
            }else if(stack.peek()=='('){
                if(out!=0){
                    out--;
                    count+=2;
                }
                stack.pop();
            }
        }*/
        //System.out.println(count);
        int low=0,high=0;
        int count=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                low++;
                high++;
            }else if(ch==')'){
                if(low>0) {
                    low--;
                    count+=2;
                }
                high--;
            }else {
                if(low>0) low--;
                high++;
            }
            if(high<0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(count);
    }
}
