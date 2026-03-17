import java.util.Arrays;

public class MaxFre {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2,2};
        int[] fre=new int[10];
        int max=0;
        int min=0;

        for(int k: arr){
           /* fre[k]++;
            if(fre[k]>max && fre[k]<min){
                max=fre[k];
            }else{
                min+=fre[k];
            }*/
            fre[k]++;
        }

        Arrays.sort(fre);
        max=fre[fre.length-1];

        for(int i=fre.length-2;i>=0;i--){
            if(fre[i]==0) break;
            if(min+fre[i]<max){
                min+=fre[i];
            }

        }

        System.out.println(max+min);
    }
}
