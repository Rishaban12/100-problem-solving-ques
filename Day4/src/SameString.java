public class SameString {
    public static void main(String[] args) {
        int[] fre1=new int[26];
        int[] fre2=new int[26];

        String a="aa";
        String b="aab";

        for(char ch: a.toCharArray()){
            fre1[ch-'a']++;
        }
        for(char ch: b.toCharArray()){
            fre2[ch-'a']++;
        }

        for(int i=0;i<a.length();i++){
            if(fre1[a.charAt(i)-'a']>fre2[a.charAt(i)-'a']){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
