import java.util.Arrays;

public class MissElement {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};

        /*int sum=0;

        for(int k: arr) sum+=k;

        int total=(arr.length*(arr.length+1))/2;

        System.out.println(Math.abs(sum-total));*/

        int res=arr.length;

        for(int i=0;i<arr.length;i++){
            res^=i;
            res^=arr[i];
        }
        System.out.println(res);
    }
}
