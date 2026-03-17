import java.util.Arrays;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        //int[] ar1=new int[arr.length];
        if(arr.length==1) {
            System.out.println(1);
            return;
        }

        int i=1;
        int j=2;

        while(j<arr.length){
            if(arr[j-1]!=arr[j]){
                arr[i]=arr[j];
                //=arr[j];
                i++;
                j++;
            }else{
                j++;
            }
        }
      /*  for(int k=0;k<i;k++){
            ar1[k]=arr[k];
        }*/
        System.out.println(Arrays.toString(arr));
    }
}
