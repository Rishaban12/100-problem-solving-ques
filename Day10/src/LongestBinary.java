public class LongestBinary {
    public static void main(String[] args) {
        String s="00011101";

        int i=0,j=0;
        boolean ones=false;
        boolean zeros=false;
        int max=0;

        while(i<s.length() && j<s.length()){
            char ch=s.charAt(j);
            if(ch=='1' && zeros){
                ones=true;
                j++;
            }else if(ch=='1' && !zeros){
                max=Math.max(max,j-i);
                zeros=false;
                i=j;
                j++;
            }
            else if(ch=='0' && !ones){
                zeros=true;
                j++;
            }else{
                max=Math.max(max,j-i);
                ones=false;
                i=j;
                j++;
            }
        }
        max=Math.max(max,j-i);
        System.out.println(max);
    }
}
