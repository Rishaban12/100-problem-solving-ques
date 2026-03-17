import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        String s="ceabaacb";
        int count=0;

        int[] fre=new int[26];

        for(char ch:s.toCharArray()){
            fre[ch-'a']++;
        }
        Arrays.sort(fre);
        int n=fre[25];
        for(int i=24;i>=0;i--){
            if(fre[i]==0) break;
            while(n<=fre[i] && fre[i]>0){
                fre[i]--;
                count++;
            }
            n=fre[i];
        }
        System.out.println(count);
    }
}
