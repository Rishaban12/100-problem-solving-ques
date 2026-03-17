public class Shift{
public static void main(String[] args){
	String s="zab";
       
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
           
            if(ch=='z' && i<s.length()-1 && (s.charAt(i+1)!='z'&& s.charAt(i+1)!='a')){
               System.out.println(false);
               return;
             }else if(ch+1!=s.charAt(i+1) && ch!=s.charAt(i+1)){
               System.out.println(false);
               return;
             }
        }
System.out.println(true);
}
}
