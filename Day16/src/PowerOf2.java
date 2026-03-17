public class PowerOf2 {
    public static void main(String[] args) {
        int n=64;
        int[] fre1=new int[10];
        digit(fre1,n);
        int f=1;

        for(int i=0;i<31;i++){
            int[] fre2=new int[10];
            digit(fre2,f);
            if(equal(fre1,fre2)){
                System.out.println(true);
                return;
            }

            f*=2;
        }
        System.out.println(false);
    }
    static void digit(int[] fre,int n){
        while(n>0){
            int idx=n%10;
            fre[idx]++;
            n/=10;
        }
    }
    static boolean equal(int[] fre1,int[] fre2){
        for(int i=0;i<10;i++){
            if(fre1[i]!=fre2[i]) return false;
        }
        return true;
    }
}
