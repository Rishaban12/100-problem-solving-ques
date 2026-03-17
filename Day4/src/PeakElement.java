public class PeakElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};

      /*  int fir=arr[0];
        int ans=-1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<fir){
                ans=i-1;
            }
            fir=arr[i];
        }
        System.out.println(ans);*/

        int l=0,r=arr.length-1;

        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        System.out.println(r);
    }
}
