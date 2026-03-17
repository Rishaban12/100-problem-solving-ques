import java.util.*;

public class AddZeros {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        find(mat);
        System.out.println(Arrays.deepToString(mat));
    }
       //int[][] arr=mat.clone();
       //System.out.println(Arrays.deepToString(arr));
        /*List<int[]> list=new ArrayList<>();

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0){
                    list.add(new int[]{i,j});
                }
            }
        }

        for(int[] p:list){
            find(mat,p[0],p[1]);
        }
        System.out.println(Arrays.deepToString(mat));
    }
    static void find(int[][] arr,int r,int c){
        //row after
        for(int i=c+1;i<arr.length;i++){
            arr[r][i]=0;
        }
        //row before
        for(int i=c-1;i>=0;i--){
            arr[r][i]=0;
        }
        //col up
        for(int i=r-1;i>=0;i--){
            arr[i][c]=0;
        }
        //col down
        for(int i=r+1;i<arr.length;i++){
            arr[i][c]=0;
        }
        //System.out.println(Arrays.deepToString(arr));
    }*/
        static void find(int[][] mat){
            int r=mat.length;
            int c=mat[0].length;

            boolean firRow=false;
            boolean firCol=false;

            for(int i=0;i<c;i++){
                if(mat[0][i]==0){
                    firRow=true;
                    break;
                }
            }

            for(int i=0;i<r;i++){
                if(mat[i][0]==0){
                    firCol=true;
                    break;
                }
            }

            for(int i=1;i<c;i++){
                for(int j=1;j<r;j++){
                    if(mat[i][j]==0){
                        mat[i][0]=0;
                        mat[0][j]=0;
                    }
                }
            }
           //row
            for(int i=1;i<c;i++){
                if(mat[i][0]==0){
                    for(int j=1;j<r;j++){
                        mat[i][j]=0;
                    }
                }
            }
           //col
            for(int i=1;i<c;i++){
                if(mat[0][i]==0){
                    for(int j=1;j<r;j++){
                        mat[j][i]=0;
                    }
                }
            }



            if(firRow){
                for(int i=0;i<c;i++){
                    mat[0][i]=0;
                }
            }
            if(firCol){
                for(int i=0;i<r;i++){
                    mat[i][0]=0;
                }
            }
        }
}
