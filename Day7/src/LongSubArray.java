public class LongSubArray {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int k=7;

        int left=0,right=0;
        int total=0,min=Integer.MAX_VALUE;

        while(right<arr.length){
           total+=arr[right];

               while(total>=k && left<=right){
                   min=Math.min(min,right-left+1);
                   total=total-arr[left];
                   left++;
               }
           right++;
        }
        if (min==Integer.MAX_VALUE){
            System.out.println(0);
            return;
        }
        System.out.println(min);
    }
}
