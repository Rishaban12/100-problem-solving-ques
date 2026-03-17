import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Dna {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Set<String> seen=new HashSet<>();
        Set<String> repeat=new HashSet<>();

        for(int i=0;i<=s.length()-10;i++){
            String t=s.substring(i,i+10);
            if(!seen.add(t)){
                repeat.add(t);
            }
        }

        System.out.println(new ArrayList<>(repeat));
    }
}
