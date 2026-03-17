import java.util.HashMap;
import java.util.Map;

public class SameMap {
    public static void main(String[] args) {
        Map<Character,String> map=new HashMap<>();
        String pattern="abba";
        String word="cat cat cat cat";

        String[] s=word.split(" ");

        if(pattern.length()!=s.length){
            System.out.println(false);
            return;
        }

        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String t=s[i];

            if(!map.containsKey(ch)){
                for(Character c: map.keySet()){
                    if(map.get(c).equals(s[i])){
                        System.out.println(false);
                        return;
                    }
                }
                map.put(ch,t);
            }
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(t)){
                    System.out.println(false);
                    return;
                }
            }

        }
        System.out.println(true);
    }
}
