import java.util.Stack;

public class RepeatedRemove {
    public static void main(String[] args) {
        //int[] fre=new int[26];
        String s="aabcbbcc";
        System.out.println(find(s));
        StringBuilder sb=new StringBuilder();

        Stack<Character> stack=new Stack<>();
        boolean find=false;
        int left=0;

        while(left<s.length()){
           int right=left;
            while(!stack.isEmpty() && right<s.length() && stack.peek()==s.charAt(right)) {
                find=true;
                right++;
            }
            if(find){
                stack.pop();
                find=false;
                left=right;
            }else {
                char ch = s.charAt(left);
                stack.push(ch);
                left++;
            }
        }
        if(stack.isEmpty()) {
            System.out.println("");
            return;
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse());
    }

    static String find(String s){
        StringBuilder sb=new StringBuilder(s);
        boolean change=true;

        while(change){
            change =false;
            int i=0;
            while(i<sb.length()){
                int j=i+1;
                while(j<sb.length() && sb.charAt(i)==sb.charAt(j)){
                    j++;
                }
                if(j-i>=2){
                    sb.delete(i,j);
                    change=true;
                    i=Math.max(0,i-1);
                }else{
                    i=j;
                }
            }
        }
        return sb.toString();
    }
}
