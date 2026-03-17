public class Fib {
    public static void main(String[] args) {
        int a=2,b=2,c=2,n=4,m=100;

        //gn=a*gn-1+b*gn-2+c;
        System.out.println(fib(a,b,c,n,m));

    }
    static int fib(int a,int b,int c,int n,int m){
        if(n==1 || n==2) return 1%m;

        long pre1=1;
        long pre2=1;
        long cur=0;

        for(int i=3;i<=n;i++){
            cur=((a*pre1)+(b*pre2)+c)%m;
            pre2=pre1;
            pre1=cur;
        }
      return (int)cur;
    }
}
