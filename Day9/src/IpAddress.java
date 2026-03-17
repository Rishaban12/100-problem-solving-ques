import java.util.ArrayList;
import java.util.List;

public class IpAddress {
    public static void main(String[] args) {
        String add="25525511135";
        List<String> list=new ArrayList<>();

        rec(0,0,list,add," ");
        System.out.println(list);
    }
    static void rec(int idx,int parts,List<String> list,String s,String path){
        if(parts==4 && idx==s.length()){
            list.add(path.substring(0,path.length()-1));
            return;
        }
        if(parts==4) return;

        for(int i=1;i<=3 && i+idx<=s.length();i++){
            String t=s.substring(idx,idx+i);
            if(valid(t)){
                rec(idx+i,parts+1,list,s,path+t+".");
            }
        }
    }
    static boolean valid(String s){
        if(s.length()>1 && s.startsWith("0")) return false;
        return Integer.parseInt(s)<=255;
    }
}
