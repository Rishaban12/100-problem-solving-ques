public class Rain {
    public static void main(String[] args) {
        int[] arr={3,0,2,0,4};
        int res=0;

        for(int i=0;i<arr.length;i++){
            int l=0,r=0;
            int min=Math.min(left(arr,i),right(arr,i));

            res+=min-arr[i];
        }
        System.out.println(res);
    }

    static int left(int[] arr,int idx){
        int max=0;
        for(int i=0;i<=idx;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
    static int right(int[] arr,int idx){
        int max=0;
        for(int i=idx;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
}
