import java.util.*;

public class GcdSort {
    public static void main(String[] args) {
        /*int[] arr={7,21,3};
        int max=0;
        for(int k: arr) max=Math.max(max,k);

        int[] parent=new int[max+1];
        int[] rank=new int[max+1];

        for(int i=0;i<max+1;i++){
            parent[i]=i;
        }

        for(int n:arr){
            for(int fact=2;fact*fact<=n;fact++){
                if(n%fact==0){
                    union(n,fact,parent,rank);
                    union(n,n/fact,parent,rank);
                }
            }
            if(n>1) union(n,n,parent,rank);
        }

        int[] sort=arr.clone();

        for(int i=0;i<arr.length;i++){
            if(find(arr[i],parent)!=find(sort[i],parent)){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
    static int find(int x,int[] parent){
        if(x==parent[x]) return x;
        return parent[x]=find(parent[x],parent);
    }
    static void union(int x,int y,int[] parent,int[] rank){
        int px=find(x,parent);
        int py=find(y,parent);

        if(rank[px]>rank[py]){
            parent[py]=px;
        }else if(rank[px]<rank[py]){
            parent[px]=py;
        }else{
            parent[py]=px;
            rank[py]++;
        }
    }*/

        int[] arr={12, 16, 27, 6};
        int[] a1=new int[arr.length];
        int min=Integer.MAX_VALUE;
        int max=-1;

        for(int i=0;i<arr.length;i++){
            a1[i]=find(arr[i]);
            min=Math.min(find(arr[i]),min);
            max=Math.max(find(arr[i]),max);
        }

        int idx=0;
        int[] res=new int[arr.length];

        for(int i=min;i<=max;i++){
            List<Integer> map=new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                if(a1[j]==i){
                    map.add(arr[j]);
                }
            }
            for(Integer key: map){
                res[idx++]=key;
            }
        }
        System.out.println(Arrays.toString(res));
    }
    static int find(int n){

        int c=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                c++;
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n>1) c++;
        return c;
    }
}
