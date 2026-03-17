import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        //int[][] dp=new int[row][col];

        //rec(arr,0,0,dp,0,a1);


    /*static void rec(int[][] arr,int row,int col,int[][] dp,int i,int[] a1){
        if( row>=arr.length || col>=arr[0].length || row<0 || col<0 || dp[row][col]==-1  || i>=a1.length) return;
        a1[i++]=arr[row][col];
        dp[row][col]=-1;

        rec(arr, row, col + 1, dp, i, a1);
        rec(arr,row+1,col,dp,i,a1);
        rec(arr,row,col-1,dp,i,a1);
        rec(arr,row-1,col,dp,i,a1);
    }*/


        int top = 0;
        int left = 0;
        int bottom = row - 1;
        int right = col - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        System.out.println(list);
    }
}


