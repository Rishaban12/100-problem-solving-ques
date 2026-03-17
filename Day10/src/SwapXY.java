public class SwapXY {
    public static void main(String[] args) {
        String a="xyxy";
        String b="yxxx";

       /* String t=swap(a);
       for(int i=0;i<a.length();i++){
           if(t.equals(b)) {
               System.out.println(true);
               return;
           }
           t=swap(t);
       }
        System.out.println(false);*/
        System.out.println(swap(a,b));
    }
    static String swap(String a){
        StringBuilder sb=new StringBuilder();
        boolean ones=false;
        int i=0;
        for(;i<a.length()-1;i++){
            if(a.charAt(i)=='x' && a.charAt(i+1)=='y' && !ones){
                sb.append('y');
                sb.append('x');
                ones=true;
                i+=1;
            }else{
                sb.append(a.charAt(i));
            }
        }
        if(i<=a.length()-1) sb.append(a.charAt(a.length()-1));
        System.out.println(sb.toString());
        return sb.toString();
    }
    static boolean swap(String a,String b){
        if(!a.replace("y","").equals(b.replace("y",""))){
            return false;
        }
        if(!a.replace("x","").equals(b.replace("x",""))){
            return false;
        }
        int i=0,j=0,n=a.length();

        while(i<n && j<n){
            while(i<n && a.charAt(i)=='y') i++;
            while(j<n && b.charAt(j)=='y') j++;

            if(i==n || j==n) break;

            if(i>j) return false;

            i++;
            j++;
        }
        return true;
    }
}
