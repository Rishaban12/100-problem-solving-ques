public class Palindrome {
    public static void main(String[] args) {
        String s="c";
        int left=0;


        while(left<s.length()){
            int right=s.length()-1;
            while(right>=left) {
                if (check(left,right,s)) {
                    //System.out.println(s.substring(left,right+1));
                    break;
                }
                right-- ;
            }
            left++;
        }
        find();
    }
    static boolean check(int i,int j,String s){
        String t=s.substring(i,j+1);
        StringBuilder sb=new StringBuilder(t);
        return t.equals(sb.reverse().toString());
    }

    static void find(){
        String s="babd";
        boolean[][] dp=new boolean[2][s.length()];

        int len=1,start=0;

        for(int i=s.length()-1;i>=0;i--){
            dp[i%2][i]=true;
            for(int j=i+1;j<s.length();j++){
                if(j-i==1){
                    dp[i%2][j]=(s.charAt(i)==s.charAt(j));
                }else{
                    dp[i%2][j]= dp[(i+1)%2][j-1] && (s.charAt(i)==s.charAt(j));
                }
                if(dp[i%2][j]){
                    if(len<j-i+1){
                        start=i;
                        len=j-i+1;
                    }
                }
            }
        }
        System.out.println(s.substring(start,start+len));
    }
}
