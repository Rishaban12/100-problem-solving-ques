import java.util.Stack;

public class Reverse{
public static void main(String[] args){
   String s="opdaedi";
   int k=2;
  int count=k;
   Stack<Character> stack=new Stack<>();
   StringBuilder sb=new StringBuilder();
   rec(s,k,sb,stack,0,count);
  System.out.println(sb.toString());
}
static void rec(String s,int k,StringBuilder sb,Stack<Character> st,int i,int count){
        if(i>=s.length()) return;
        if(count==k){
        while(i<s.length() && count>0){
        st.push(s.charAt(i));
	count--;
        i++;
         }
         if(i==s.length()){
           while(!st.isEmpty()){
             sb.append(st.pop());
              } 
           }
         i=i-1;
        }else{
         while(!st.isEmpty()){
             sb.append(st.pop());
              }
            sb.append(s.charAt(i));
            count++;
           } 
        rec(s,k,sb,st,i+1,count);
}
}







