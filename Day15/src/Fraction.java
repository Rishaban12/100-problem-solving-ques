public class Fraction {
    public static void main(String[] args) {
        String s = "-1/2+1/2";

        int i = 0;
        int sign = 1;
        int num = 0;
        int den = 1;

        while (i < s.length()) {
            if (i == 0 || s.charAt(i) == '+' || s.charAt(i) == '-') {
                sign = (s.charAt(i) == '+') ? 1 : -1;
                i++;
            }
            int curNum = 0;
            while (i < s.length() && s.charAt(i) != '/') {
                curNum = curNum * 10 + s.charAt(i)-'0';
                i++;
            }
            curNum*=sign;
            i++;
            int curDen = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                curDen = curDen * 10 + s.charAt(i)-'0';
                i++;
            }
            num=den*curNum+num*curDen;
            den=den*curDen;
            int c=gcd(Math.abs(num),den);

            num/=c;
            den/=c;

        }

        System.out.println(num+"/"+den);
    }
        static int gcd(int a,int b) {
             if(b==0) return a;
             return gcd(b,a%b);
        }
}
