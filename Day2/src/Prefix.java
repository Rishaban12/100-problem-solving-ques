public class Prefix {
    public static void main(String[] args) {
        //String[] str={"flower","flow","flight"};
        String[] str={"dog","racecar","car"};

        String first=str[0];
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);
            boolean check=true;

            for(int j=1;j<str.length;j++){
                String s=str[j];
                if(i<s.length() && s.charAt(i)!=ch){
                    check=false;
                    break;
                }
            }
            if(check){
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
