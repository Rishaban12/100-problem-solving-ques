import java.util.Arrays;

public class MinPath {
    public static void main(String[] args) {
        /*int[][] arr={{9,4,9,9},
        {6,7,6,4},
        {8,3,3,7},
        {7,4,9,10}};*/

        int[][] arr={{4,4},{3,7}};

        int[][] dp=new int[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++) Arrays.fill(dp[i],-1);

        System.out.println(rec(arr,0,0,dp));
    }
    static int rec(int[][] arr,int i,int j,int[][] dp){
        if(i==arr.length-1 && j==arr.length-1) return arr[i][j];
        if(i<0 || j<0 || i==arr.length || j==arr.length) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];

        int right=rec(arr,i+1,j,dp);
        int down=rec(arr,i,j+1,dp);
        /*int left=rec(arr,i-1,j,dp);
        int up=rec(arr,i,j-1,dp);*/

        return dp[i][j]=arr[i][j]+Math.min(right,down);
    }
}
