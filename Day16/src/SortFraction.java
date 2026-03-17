public class SortFraction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int k=3;
        int len=((arr.length)*(arr.length-1))/2;

        int[] num=new int[len];
        int[] den=new int[len];
        double[] val=new double[len];

        int idx=0;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                num[idx]=arr[i];
                den[idx]=arr[j];
                val[idx]=(double) arr[i]/arr[j];
                idx++;
            }
        }
        bubble(num,den,val);
        System.out.println(num[k-1]+"/"+den[k-1]);
    }
    static void bubble(int[] num,int[] den,double[] val){
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-i-1;j++){
                if(val[j]>val[j+1]){
                    int t=num[j+1];
                    num[j+1]=num[j];
                    num[j]=t;

                    t=den[j+1];
                    den[j+1]=den[j];
                    den[j]=t;

                    double v=val[j+1];
                    val[j+1]=val[j];
                    val[j]=v;
                }
            }
        }
    }
}
