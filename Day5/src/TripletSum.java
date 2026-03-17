import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};

        Arrays.sort(arr);
        List<List<Integer>> l=new ArrayList<>();


        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=arr.length-1;

            while(j<k){
                int total=arr[i]+arr[j]+arr[k];
                if(total==0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    l.add(list);
                    j++;
                    k--;
                    while (j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }else if(total<0){
                    j++;
                }else if(total>0){
                    k--;
                }
            }
        }
        System.out.println(l);
    }
}
