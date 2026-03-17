public class LargeProduct {
    public static void main(String[] args) {
        int[] arr={-10,-10,2,2};

        int max1=0,max2=0;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;

        for(int k: arr){

            if(k>=max1){
                max2=max1;
                max1=k;
            }
            else if (k>max2 && k<max1) {
                max2=k;
            }

            if(k<=min1) {
                min2 = min1;
                min1 = k;
            } else if (k<min2 && k>min1) {
                min2=k;
            }
        }

        System.out.println(Math.max(max1*max2, min1*min2));
    }
}
