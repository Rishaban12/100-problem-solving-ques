public class FactZero {
    public static void main(String[] args) {
        int n=100;
      /*  double res=fact(n);
        int count=10;
        int c=0;
        System.out.println(res);
        while(res%count==0){
            c++;
            count*=10;
        }
        System.out.println(c);
    }
    static double fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);*/
        int res=0;
        for(int i=5;i<n;i*=5){
            res+=n/i;
        }
        System.out.println(res);
    }
}
