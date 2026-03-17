public class AddString {
    public static void main(String[] args) {
        String n1="11",n2="123";

        char ch1=' ';
        char ch2=' ';

        int i=n1.length()-1,j=n2.length()-1;
        StringBuilder sb=new StringBuilder();
        int sub=0;

        while(i>=0 || j>=0){
            int num1=0;
            int num2=0;
            if(i>=0) {
                num1 = n1.charAt(i) - '0';
            }
            if(j>=0) {
                num2 = n2.charAt(j) - '0';
            }
            int total=num1+num2;
            if(sub!=0){
                total+=sub;
            }
            if(total>=10){
                sb.append(total%10);
                sub=total/10;
            }else {
                sub=0;
                sb.append(total);
            }
            i--;
            j--;
        }
        if(sub!=0){
            sb.append(sub);
        }
        System.out.println(sb.reverse().toString());
    }
}
