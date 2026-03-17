public class HighestNum {
    public static void main(String[] args) {
        int n=696;
        //String s=n+"";
        int res=0;
        int digit=0;

       // int fir=n/10;
       // int sec=n%10;
       // int total=0;

    /* while(n>0){
         int fir=n%10;*/
       /* for(char ch: s.toCharArray()){
            int fir=ch-'0';
         if (fir <= 3) {
             res = 3+res * 10;
         } else if (fir <= 7 ) {
             res = 7+res * 10;
         }else{
             System.out.println(0);
             return;
         }
         //total*=res;
         //n/=10;
     }*/

        /*if(sec<3) {
            res = res * 10 + 3;
        }else if(sec<7 && sec>3) {
            res = res * 10 + 7;
        }*/
        boolean flag=false;
        int mul=1;
        int val=0;
        while(n>0){
            int t=n%10;
            digit++;
            if(n/10<=0 && t>=7){
                flag=true;
                break;
            }
            if(t<3){
                val=3;
            }else if(t>=3 && t<7){
                val=7;
            } else{
                flag=true;
                break;
            }
            res+=mul*val;
            mul*=10;
            n/=10;
        }
       //System.out.println(flag);

        if(flag){
            res=0;
            mul=1;
            for(int i=0;i<digit+1;i++){
                res+=3*mul;
                mul*=10;
            }/*
            System.out.println(res);
            return;*/
        }
       System.out.println(res);
    }
}
