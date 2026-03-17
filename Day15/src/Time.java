import java.util.Arrays;

public class Time {
    public static void main(String[] args) {
        String[] s={"23:59","00:00"};

        int[] min=new int[s.length];

        for(int i=0;i<s.length;i++){
            int fir=Integer.parseInt(s[i].substring(0,2));
            int sec=Integer.parseInt(s[i].substring(3));

            min[i]=fir*60+sec;
        }
        int mins=Integer.MAX_VALUE;
        Arrays.sort(min);
        for(int i=1;i<min.length;i++){
            mins=Math.min(min[i]-min[i-1],mins);
        }

        mins=Math.min(1440-min[min.length-1]+min[0],mins);
        System.out.println(mins);
    }
}
