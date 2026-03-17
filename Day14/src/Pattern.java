public class Pattern {
    public static void main(String[] args) {
        String s="ACIDIFICATIONOP";
        if(s.length()%2==0){
            System.out.println("");
            return;
        }
        int mid=s.length()/2;
        int gap=0;


        /*for(int i=0;i<mid+1;i++){
            int front=mid+i;
            int back=mid-i;

            if(front==back){
                System.out.print(s.charAt(front));
                for (int j=0;j<=mid*2+1;j++) System.out.print(" ");
                System.out.println(s.charAt(front));
            }else if(back==0){
                System.out.print(s.charAt(front));
                for (int k=0;k<mid;k++) System.out.print(" ");
                System.out.print(s.charAt(back));
                for (int k=0;k<=mid;k++) System.out.print(" ");
                System.out.print(s.charAt(front));
            }
            else{
                System.out.print(s.charAt(front));
                for (int k=0;k<gap;k++) {
                    System.out.print(" ");
                }
                System.out.print(s.charAt(back));
                for (int k=0;k<mid*2-gap*2;k++) System.out.print(" ");
                System.out.print(s.charAt(back));
                for (int k=0;k<gap;k++) System.out.print(" ");
                System.out.println(s.charAt(front));
                gap++;
            }
        }
        System.out.println();
        //DOWN
        gap=gap-1;
        for(int i=1;i<mid+1;i++){
            int front=i;
            int back=s.length()-(i+1);

            if(front==back){
                System.out.print(s.charAt(front));
                for (int j=0;j<=mid*2+1;j++) System.out.print(" ");
                System.out.println(s.charAt(front));
            }
            else{
                System.out.print(s.charAt(back));
                for (int k=0;k<gap;k++) {
                    System.out.print(" ");
                }
                System.out.print(s.charAt(front));
                for (int k=0;k<mid*2-gap*2;k++) System.out.print(" ");
                System.out.print(s.charAt(front));
                for (int k=0;k<gap;k++) System.out.print(" ");
                System.out.println(s.charAt(back));
                gap--;
            }
        }*/

        boolean find=false;
        int outergap=s.length()-2;
        int innergap=0;
        int front=0;
        int back=0;
        for(int i=0;i<s.length();i++){
            if(mid-i>=0 && mid+i<s.length()) {
                front = mid - i;
                back = mid + i;
            }else{
                find=true;
                front=front+1;
                back=back-1;
            }
            if(front==back){
                if(find){
                    innergap-=1;
                    outergap+=2;
                }
                System.out.print(s.charAt(front));
                for(int k=0;k<outergap;k++) System.out.print(" ");
                System.out.println(s.charAt(front));
                if(!find) {
                    outergap -= 2;
                }
            }else {
                if(find){
                    outergap+=2;
                    innergap-=1;
                }
                System.out.print(s.charAt(back));
                for (int k=0;k<innergap;k++) System.out.print(" ");
                if(front!=0) {
                    System.out.print(s.charAt(front));
                    for (int k = 0; k < outergap; k++) System.out.print(" ");
                    System.out.print(s.charAt(front));
                }else{
                    System.out.print(s.charAt(front));
                    //for (int k = 0; k < outergap; k++) System.out.print(" ");
                }
                for (int k=0;k<innergap;k++) System.out.print(" ");
                System.out.println(s.charAt(back));
                if(!find && front!=0) {
                    innergap++;
                    outergap-=2;
                }
                if(front==0) {
                    outergap=-1;
                    //innergap-=1;
                }
            }
        }

    }
}
