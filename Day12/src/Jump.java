public class Jump {
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int max=0,count=0,end=0;

        if(arr[0]==0){
            System.out.println(-1);
            return;
        }

        for(int i=0;i<arr.length;i++){
            max=Math.max(max,i+arr[i]);
            if(max>=arr.length){
                System.out.println(true);
                return;
            }
            if(end==i){
                count++;
                end=max;
            }
        }

        if(count==0) {
            System.out.println(-1);
            return;
        }
        System.out.println(count);
    }
}
