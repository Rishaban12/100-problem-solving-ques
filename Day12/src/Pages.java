public class Pages {
    public static void main(String[] args) {
        int[] arr={12,34,67,90};
        int k=2;
        int low=0,high=0;

        for(int i=0;i<arr.length;i++){
            high+=arr[i];
            low=Math.max(low,arr[i]);
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;

            int piece=1;
            int cur=0;

            for(int i=0;i<arr.length;i++){
                if(cur+arr[i]<=mid){
                    cur+=arr[i];
                }else{
                    piece++;
                    cur=arr[i];
                }
            }
            if(piece<=k){
                high=mid-1;
                ans=mid;
            }
            if(piece>k){
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
