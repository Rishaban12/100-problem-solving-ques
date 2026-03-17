import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int[] fre=new int[3];

        for(int k: arr) fre[k]++;
        int idx=0;

        for(int i=0;i<3;i++){
            while(fre[i]-->0){
                arr[idx++]=i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
