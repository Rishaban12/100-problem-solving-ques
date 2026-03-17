public class StringSplit {
    public static void main(String[] args) {
        String s="Hello, my name is rishab";
        //String s="rishab";

       /* String[] t=s.split(" ");
        System.out.println(t.length);*/

        int total=0;
        boolean find=false;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch!=' ' && (i==0 ||s.charAt(i-1)==' ')){
                total++;
                //find=true;
            }
        }
        System.out.println(total);

    }
}
