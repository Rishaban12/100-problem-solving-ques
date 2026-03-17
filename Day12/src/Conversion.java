public class Conversion {
    public static void main(String[] args) {
        String s="226";
        StringBuilder sb=new StringBuilder();
        for(char ch: s.toCharArray()){
            int k=(ch-'0');
            sb.append((char)(k+64));
        }
        System.out.println(sb.toString());
    }
}
