import java.util.Stack;

public class StringK{
public static void main(String[] args){
   String s="abcdefgh";
   int k=2;
   Stack<Character> stack=new Stack<>();
   StringBuilder sb=new StringBuilder();
   rec(s,k,sb,stack,0);
  System.out.println(sb.toString());
}
static void rec(String s,int k,StringBuilder sb,Stack<Character> st,int i){
  	if(i==s.length()) return;
        if(i<k ){
   	st.push(s.charAt(i));
	}else{
         while(!st.isEmpty()){
	     sb.append(st.pop());
              }
            sb.append(s.charAt(i));
           } 
        rec(s,k,sb,st,i+1);
}
}
