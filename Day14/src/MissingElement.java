import java.util.HashSet;
import java.util.Set;

public class MissingElement {
    public static void main(String[] args) {
        int[] a={92, 11, 493, 20, 5};
        int[] b={2,3,1,0,5};

        //find(a,b);

      //  quick(a,0,a.length-1);
       /* quick(b,0,b.length-1);

        for(int k: a){
            if(binary(b,0,b.length-1,k)==-1){
                System.out.println(k);
            }
        }*/

        Set<Integer> set=new HashSet<>();

        for(int k: b) set.add(k);

        for(int k: a){
            if(!set.contains(k)){
                System.out.println(k);
            }
        }

       /* int i=0,j=0;

        while(i<a.length && j<b.length){
           if(a[i]>b[j]){
               j++;
           }
           else if(a[i]<b[j]){
               System.out.println(a[i]);
               i++;
           } else if(a[i]==b[j]){
               i++;
               j++;
           }
        }
        while (i<a.length){
            System.out.println(a[i]);
            i++;
        }*/

    }
    static void quick(int[] arr,int low,int high){
        if(low<high){
            int pivot=arr[low+(high-low)/2];
            int i=low;
            int j=high;
            while(i<=j){
                while(arr[i]<pivot) i++;
                while(arr[j]>pivot) j--;
                if(i<=j){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                    i++;
                    j--;
                }
            }
            if(low<j){
                quick(arr,low,j);
            }
            if(i<high){
                quick(arr,i,high);
            }
        }
    }
    static void find(int[] a,int[] b){
        for(int i=0;i<a.length;i++){
            boolean flag=true;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(a[i]);
            }
        }
    }
    static int binary(int[] arr,int low,int high,int target){
        while(low<=high){
            int m=low+(high-low)/2;
            if(arr[m]==target){
                return m;
            }else if(arr[m]>target){
                high=m-1;
            }else{
                low=m+1;
            }
        }
        return -1;
    }
}
