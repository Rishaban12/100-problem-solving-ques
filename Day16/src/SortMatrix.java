import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMatrix {
    public static void main(String[] args) {
        int[][] mat={{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        int[][] res=new int[mat.length][mat[0].length];

        for(int i=0;i<mat[0].length;i++){
            row(res,i,mat.length,mat[0].length,mat);
        }
        for(int i=1;i<mat.length;i++){
            col(res,i,mat.length,mat[i].length,mat);
        }
        System.out.println(Arrays.deepToString(res));
    }
    static void row(int[][] res,int ind,int ro,int col,int[][] mat){
        int r=0,c=ind;
        List<Integer> set=new ArrayList<>();
        boolean flag=false;
        while(r<ro && c<col){
            flag=true;
            set.add(mat[r][c]);
            r++;
            c++;
        }
        if(!flag){
            res[r][c]=mat[r][c];
            return;
        }
        Collections.sort(set);
        r=0;
        c=ind;
        while(r<ro && c<col){
            res[r][c]=set.get(r);
            r++;
            c++;
        }
    }

    static void col(int[][] res,int ind,int row,int col,int[][] mat){
        int r=ind,c=0;
        List<Integer> set=new ArrayList<>();
        boolean flag=false;
        while(r<row && c<col){
            flag=true;
            set.add(mat[r++][c++]);
        }
        if(!flag){
            res[r][c]=mat[r][c];
            return;
        }
        Collections.sort(set);
        r=ind;
        c=0;
        while(r<row && c<col){
            res[r][c]=set.get(c);
            r++;
            c++;
        }
    }

}
