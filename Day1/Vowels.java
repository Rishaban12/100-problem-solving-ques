public class Vowels {
    public static void main(String[] args) {
        String s="cat";
        StringBuilder sb=new StringBuilder();


        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vowels(ch)) {
                if (i+1<s.length() && ch == s.charAt(i + 1)) {
                    int j=i+1;
                    sb.append(ch);
                    while (j < s.length() && ch == s.charAt(j)) {
                        sb.append(ch);
                        j++;
                    }
                    i=j-1;
                }
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
    static boolean vowels(char ch){
        return ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}
