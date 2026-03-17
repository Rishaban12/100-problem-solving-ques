public class Twice {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};

        int[] fre=new int[10];

        for(int k: arr) fre[k]++;

        for(int k: fre) {
            if(k>=2){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
