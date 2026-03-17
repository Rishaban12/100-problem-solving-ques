public class MinimumDistance {
    public static void main(String[] args) {
        int[] arr={7,1,3,1,7};

        int i=0;
        int min=Integer.MAX_VALUE;
        while(i<arr.length-1){
            int j=arr.length-1;
            int fir=arr[i];
            while(j>i){
                if(arr[j]==fir){
                    min=Math.min(min,j-i);
                    break;
                }
                j--;
            }
            i++;
        }
        if(min==Integer.MAX_VALUE){
            System.out.println(-1);
            return;
        }
        System.out.println(min);
    }
}
