import java.util.Stack;

public class Identical{
public static void main(String[] args){

String s="abcccbbbaa";

StringBuilder sb=new StringBuilder();
Stack<Character> st=new Stack<>();

for(int i=0;i<s.length();i++){
        st.push(s.charAt(i));   
}
 char val=' ';
 int count=0;
while(!st.isEmpty()){
//   sb.append(st.poll);
   if(val == ' '){ val=st.peek();
   sb.append(st.pop());
   count=1;
   }else if(val==st.peek()){
      sb.append(st.pop());
      count++;        
    if(count>=3){
       for(int i=1;i<count;i++) sb.deleteCharAt(sb.length()-1);
       while(!st.isEmpty() && st.peek()==val) st.pop();
       count=0;
       val=' ';
   }
   }
   else {
    count=0;
    sb.append(st.peek());
    val=st.pop();
    count++;
}
}
System.out.println(sb.reverse().toString());
}

}


