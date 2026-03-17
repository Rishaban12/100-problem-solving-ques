public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target=2;

        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }else if(arr[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        System.out.println(l);
    }
}
