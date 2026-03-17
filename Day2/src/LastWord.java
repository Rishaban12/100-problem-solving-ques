public class LastWord {
    public static void main(String[] args) {
       // String s="Hello World";
        //String s=" fly  me to the moon    ";
        String s=" luffy is jollyboy";

        StringBuilder sb=new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(sb.length()!=0 && ch==' '){
                break;
            }
            if(sb.length()==0 && ch==' '){
                continue;
            }
            sb.append(ch);
        }
        System.out.println(sb.length());
    }
}
