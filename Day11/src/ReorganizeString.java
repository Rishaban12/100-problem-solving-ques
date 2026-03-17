import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    public static void main(String[] args) {
        String s="aba";
        System.out.println(find(s));
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue< Map.Entry<Character,Integer> > pq=new PriorityQueue<>((a, b)->b.getValue()-a.getValue());

        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        pq.addAll(map.entrySet());

        while(pq.size()>=2){
            Map.Entry<Character,Integer> fir=pq.poll();
            Map.Entry<Character,Integer> sec=pq.poll();

            sb.append(fir.getKey());
            sb.append(sec.getKey());

            fir.setValue(fir.getValue()-1);
            sec.setValue(sec.getValue()-1);

            if(fir.getValue()>0) pq.offer(fir);
            if(sec.getValue()>0) pq.offer(sec);
            //map.put(m.getKey(),map.get(m.getKey())-1);
        }
        if(!pq.isEmpty()) {
            Map.Entry<Character,Integer> fir=pq.poll();
            if(fir.getValue()>1) {
                System.out.println("");
                return;
            }
            sb.append(fir.getKey());
        }
        System.out.println( sb.toString());
    }
    static String find(String s){
        int[] fre=new int[26];
        int maxInd=0;
        int maxFre=0;
        for(char ch:s.toCharArray()) {
            fre[ch-'a']++;
            if(maxFre<fre[ch-'a']){
                maxFre=fre[ch-'a'];
                maxInd=ch-'a';
            }
        }
        if(maxFre>(s.length()+1)/2) return "";
        char[] c=new char[s.length()];
        int idx=0;
        while(maxFre>0){
            c[idx]=(char)(maxInd+'a');
            idx+=2;
            maxFre--;
        }
        for(int i=0;i<26;i++){
            while(fre[i]>0){
                if(idx>=s.length()){
                    idx=1;
                }
                c[idx]=(char)(i+'a');
                idx+=2;
                fre[i]--;
            }
        }
        return new String(c);
    }
}
