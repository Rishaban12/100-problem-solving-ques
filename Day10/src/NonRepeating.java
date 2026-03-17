import java.util.LinkedList;
import java.util.Queue;

public class NonRepeating {
    public static void main(String[] args) {
        String s="abac";
        StringBuilder sb=new StringBuilder();
        char n=' ';
        char count=' ';

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(n==' ' && count==' '){
                n=ch;
                count=ch;
                sb.append(ch);
            }
            else if(ch!=n){
               sb.append(n);
               count=ch;
            }else if(ch==n && count==ch){
                sb.append('#');
                count=' ';
                n=' ';
            }else{
                sb.append(count);
                n=count;
            }
        }
        check("abac");
        //System.out.println(count);
       // System.out.println(sb.toString());
    }
    static void check(String s){

        int[] fre=new int[26];
        Queue<Character> queue=new LinkedList<>();
        StringBuilder sb=new StringBuilder();

        for(char ch: s.toCharArray()){
            fre[ch-'a']++;
            queue.offer(ch);

            while(!queue.isEmpty() && fre[queue.peek()-'a']>1) {queue.poll();}

            if(queue.isEmpty()){
                sb.append('#');
            }else{
                sb.append(queue.peek());
            }
        }
        System.out.println(sb.toString());
    }
}
