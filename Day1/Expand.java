import java.util.Arrays;

public class Expand {
    public static void main(String[] args) {
        int k=12;
        StringBuilder sb=new StringBuilder();
        int d=1;

        while(k>0){
           if(k%10!=0) {
               sb.append(k % 10 * d);
               sb.append("+");
           }
           d*=10;
           k/=10;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.reverse();
        String[] arr=sb.toString().split(" ");

        int j=-1;

        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals("+") && j==-1){
                j=i;
            }else if(arr[i].equals("+")){
                String t1=arr[i-1];
                arr[i-1]=arr[j];
                arr[j]=t1;
                j=-1;
            }
        }
        sb.setLength(0);

        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
//        for(int i=sb.length()-3;i>=0;i--){
//            sb.replace(i,0,sb.toString());
//        }


        System.out.println(sb.toString());
    }
}
