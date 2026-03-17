import java.util.Arrays;

public class ProductArr {
    public static void main(String[] args) {
        int[] arr={-1,1,0,-3,3};

        int[] a1=new int[arr.length];
        int[] a2=new int[arr.length];

        a1[0]=1;
        a2[arr.length-1]=1;

        for(int i=1;i<arr.length;i++){
            a1[i]=arr[i-1]*a1[i-1];
        }
       // System.out.println(Arrays.toString(a1));
        for(int i=arr.length-2;i>=0;i--){
            a2[i]=arr[i+1]*a2[i+1];
        }
        //System.out.println(Arrays.toString(a2));

        for(int i=0;i<arr.length;i++){
            arr[i]=a1[i]*a2[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
