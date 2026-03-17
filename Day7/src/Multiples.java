public class Multiples {
    public static void main(String[] args) {
        int n=1;
        int m=10;


        int div=n/m;
       /* if(n<m) {
            System.out.println(m);
            return;
        }*/
        int small=div*m;
        int big=(div+1) * m;

        int min1=Math.abs(small-n);
        int min2=Math.abs(big-n);


        if(min1<=min2){
            System.out.println(small);
        }else {
            System.out.println(big);
        }
    }
}
