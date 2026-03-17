import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxFreq {
    public static void main(String[] args) {
        int[] num1={1,2,2,1,10};
        int[] num2={2};

        int max=0;

        for(int k:num2){
            if(max<k) max=k;
        }

        int[] fre=new int[max+1];

        for(int k: num2) fre[k]++;

        List<Integer> list=new ArrayList<>();

        for(int k: num1){
            if(k<=max && fre[k]>0 ){
                    list.add(k);
                    fre[k]--;
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
