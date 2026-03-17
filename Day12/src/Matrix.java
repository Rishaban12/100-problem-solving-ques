public class Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};

        int row = arr.length;
        int col = arr[0].length;
        first(arr,row,col,9);
    }
    static void first(int[][] arr,int row,int col,int target){
       int l=0,r=row-1;

       while(l<=r){
           int mid=l+(r-l)/2;
           if(arr[mid][col-1]>= target){
               if(sec(arr[mid],target)){
                   System.out.println(true);
                   return;
               }
               r=mid-1;
           }else{
               l=mid+1;
           }
       }
        System.out.println(false);
    }
    static boolean sec(int[] arr,int target){
          int l=0,r=arr.length-1    ;
          while(l<=r){
              int mid=l+(r-l)/2;

              if(arr[mid]==target){
                  return true;
              }else if(arr[mid]<target){
                  l=mid+1;
              }else{
                  r=mid-1;
              }
          }
          return false;
    }
}
