public class TotalSubarrays {
    public static void main(String[] args) {
         int[] arr={1,2,3};
         int k=2;

         /*int left=0;
         int count=0;

         for(left=0;left<arr.length;left++){
              int right=left;
             int total=0;
                  while (right<arr.length) {
                      total += arr[right];
                      if (total == k) count++;
                      right++;
                  }
              }*/

        int right=0,left=0,total=0,count=0;

       while(right<arr.length){
           total+=arr[right];

          while (total>k && left <= right) {
               total -= arr[left];
               left++;
           }
           if(total==k) {
               count++;
           }
            right++;
       } System.out.println(count);


    }
}
