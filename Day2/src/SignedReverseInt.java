public class SignedReverseInt {
    public static void main(String[] args) {
        int x=-120;

        int sign=x>=0?1:-1;

        String s=x+"";

        StringBuilder sb=new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            if(i==s.length()-1 && s.charAt(i)=='0'){
                continue;
            }
            if(i==0 && s.charAt(i)=='-'){
                continue;
            }
            sb.append(s.charAt(i));
        }
       // System.out.println(sb.toString());
        long val=Long.parseLong(sb.toString())*sign;


            if(val>=Integer.MIN_VALUE && val<=Integer.MAX_VALUE){
                System.out.println((int)val);
                return;
            }
        System.out.println(0);

    }
}
