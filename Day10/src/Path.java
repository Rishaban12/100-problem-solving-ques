public class Path {
    public static void main(String[] args) {
        char[][] arr={{'a','b','c'},{'d','e','f'},{'g','h','i'}};
        Character[][] dp=new Character[arr.length][arr.length];
        int count=0;
        System.out.println( rec(arr,0,0,count,dp));
    }
    static int rec(char[][] arr,int right,int bottom,int count,Character[][] dp){
        if(right>arr.length-1 || bottom>arr[0].length-1){
            return 0;
        }

        if(right==arr.length-1 && bottom== arr[0].length-1){
           return 1;
        }

        dp[right][bottom]=arr[right][bottom];
      return  rec(arr,right+1,bottom,count,dp)+
        rec(arr,right,bottom+1,count,dp);
    }
}
