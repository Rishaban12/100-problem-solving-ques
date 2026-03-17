public class Econded {
    public static void main(String[] args) {
        String s="a2345678999999999999999";
        int k=1;

        /*String s="ha22";
        int k=5;*/

       /* if(s.length()>=k-1) {
            System.out.println(s.charAt(k-1));
            return;
        }*/

       /* StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                int len=(ch-'0');
                String t=sb.toString();
                sb.setLength(0);
                for(int j=0;j<len;j++){
                    sb.append(t);
                }
                continue;
            }
            sb.append(ch);
        }
        System.out.println(sb.charAt(k-1));*/

        long size=0;

        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                size=size*(ch-'0');
            }else{
                size++;
            }
        }

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            k=(int)(k%size);
            if(k==0 && Character.isLetter(ch)){
                System.out.println(ch);
                return;
            }

            if(Character.isDigit(ch)){
                size/=(ch-'0');
            }else{
                size--;
            }
        }
        System.out.println(" ");
    }
}
