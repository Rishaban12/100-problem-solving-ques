public class Compute {
    public static void main(String[] args) {
        int a=2,b=10,m=1000;

        int res=1;

        a=a%m;

        while(b>0){
            if(b%2 ==1){
                res=(res*a)%m;
            }
            a=(a*a)%m;
            b/=2;
        }
        System.out.println( (res));
    }
}
