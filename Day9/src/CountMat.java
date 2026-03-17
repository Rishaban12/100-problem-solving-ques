public class CountMat {
    public static void main(String[] args) {
        int[][] arr={{3,7,9},{9,11,12},{15,16,17}};

        int count=0;


        for(int i=0;i<arr.length;i++){
            int rowMax=arr[i][0];
            int col=0;

            for(int j=1;j<arr[i].length;j++){
                if(rowMax<arr[i][j]){
                    rowMax=arr[i][j];
                    col=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<arr.length;k++){
                if(rowMax>arr[k][col] && col!=k){
                    flag=false;
                    break;
                }
            }
            if(flag) count++;
        }
        System.out.println(count);
    }
}
