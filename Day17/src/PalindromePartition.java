import java.util.Arrays;

public class PalindromePartition {
    public static void main(String[] args) {
        String s="ababbbabbababa";
        int[] dp=new int[s.length()];
        boolean[][] bool=new boolean[s.length()][s.length()];

        Arrays.fill(dp,-1);

        for(int i=s.length()-1;i>=0;i--){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && (j-i<=2 || bool[i+1][j-1]==true)){
                    bool[i][j]=true;
                }
            }
        }
        System.out.println(rec(0,s,dp,bool)-1);
    }
    static int rec(int ind,String s,int[] dp,boolean[][] bool){
        if(ind==s.length()) return 0;
        if(dp[ind]!=-1) return dp[ind];

        int min=Integer.MAX_VALUE;

        for(int i=ind;i<s.length();i++){
            if(bool[ind][i]){
                int temp=1+rec(i+1,s,dp,bool);
                if(temp<min){
                    //System.out.println(temp);
                    min=temp;
                }
            }
        }
        return dp[ind]=min;
    }
}
