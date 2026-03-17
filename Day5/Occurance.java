public class Occurance{
public static void main(String[] args){
int n=5722551;

String s=n+"";

int[] fre=new int[10];

for(char ch: s.toCharArray()){
   fre[ch-'0']++;
}
for(char ch: s.toCharArray()){
if(fre[ch-'0']==1){
 System.out.println(ch);
 return;
}
}
System.out.println(-1);
}
}
