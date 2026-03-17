public class FirstVowel{
public static void main(String[] args){
String s="education";
int[] fre=new int[26];


for(char ch:s.toCharArray()){
  fre[ch-'a']++;
}

for(char ch: s.toCharArray()){
  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
    if(fre[ch-'a']==1){
         System.out.println(ch);
         return;
 }
}
}

System.out.println(-1);


}
}
