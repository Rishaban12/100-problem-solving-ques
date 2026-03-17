public class BadCount {
    public static void main(String[] args) {
        int[] arr={1, 12, 10, 3, 14, 10, 5};
        int find=3;
        int count=0;

        for(int k: arr){
            if(k<=find) count++;
        }

        int i=0;
        int min=Integer.MAX_VALUE;
        while(i+count<=arr.length){
            int j=i;
            int c=0;
            while(j<i+count){
                if(arr[j]>find){
                    c++;
                }
                j++;
            }
            min=Math.min(c,min);
            i++;
        }
        System.out.println(min);
    }
}
