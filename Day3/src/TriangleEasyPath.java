import java.util.Arrays;
import java.util.List;

public class TriangleEasyPath {
    public static void main(String[] args) {
        List<List<Integer>> list= Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3,4),
                Arrays.asList(6,5,7),
                Arrays.asList(4,1,8,3)
        );
      /*  List<List<Integer>> list= Arrays.asList(
                Arrays.asList(-10)
        );

        int total=0;

        for(int i=0;i<list.size();i++){
            int min=Integer.MAX_VALUE;
            for(Integer k: list.get(i)){
                min=Math.min(k,min);
            }
            total+=min;
        }
        System.out.println(total);*/

        Integer[][] dp=new Integer[list.size()][list.size()];

        System.out.println(rec(list,dp,0,0));
    }
    static int rec(List<List<Integer>> list,Integer[][] dp,int row,int col){
        if(dp[row][col]!=null) {return dp[row][col];}
        if(row==list.size()-1) {return list.get(row).get(col);}

        int min=list.get(row).get(col)+Math.min(rec(list,dp,row+1,col),rec(list,dp,row+1,col+1));
        dp[row][col]=min;
        return min;
    }
}
