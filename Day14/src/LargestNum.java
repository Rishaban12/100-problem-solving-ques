import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNum {
    public static void main(String[] args) {
        int[] arr={3,5,9,30,34};
        //quick(arr,0,arr.length-1);
        //System.out.println(Arrays.toString(arr));
        StringBuilder sb=new StringBuilder();
        /*int max=0;
        for(int i=arr.length-1;i>=0;i--){
            max=Math.max(arr[i],max);
        }
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));
        for(int exp=1;max/exp>0;exp*=10){
             find(list,exp,sb);
        }
        System.out.println(sb);*/
        check(arr,sb);
        System.out.println(sb);

    }
    static void quick(Integer[] arr,int low,int high) {

            int pivot = arr[low + (high - low) / 2];
            int i = low;
            int j = high;

            while (i <= j) {
                while (arr[i] < pivot) i++;
                while (arr[j] > pivot) j--;

                if (i <= j) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                    i++;
                    j--;
                }
            }
            if (low < j) {
                quick(arr, low, j);
            }
            if (i < high) {
                quick(arr, i, high);
            }
        }
    static void find(List<Integer> list,int exp,StringBuilder sb){
        if(list.size()<=0) return;
        int m=0;
        int idx=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)/exp>0 && list.get(i)/(exp*10)==0){
               if(m< list.get(i)){
                   m= list.get(i);
                   idx=i;
               }
            }
        }

        if(idx==-1) return;
        int rev=0;
        int n=m;
        while(m>0){
            rev=rev*10+m%10;
            m/=10;
        }
        int num=Math.max(rev,n);
        sb.append(num);
        list.remove(idx);
        find(list,exp,sb);
    }
    static void check(int[] arr,StringBuilder sb){
        String[] num=new String[arr.length];
        int idx=0;
        for(int k: arr) {
            num[idx++]=String.valueOf(k);
        }
        if(num[0]=="0") {
            sb.append(0);
            return;
        }
        Arrays.sort(num,(a,b)->(b+a).compareTo(a+b));

        for(String n: num) sb.append(n);
    }
}
