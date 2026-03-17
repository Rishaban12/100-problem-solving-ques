public class Sorting {
    public static void main(String[] args) {
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;

        String[] uni=new String[words.length];
        int[] fre=new int[words.length];

        int size=0;
        for(int i=0;i<words.length;i++){
            boolean find=false;

            for(int j=0;j<size;j++){
                if(words[i].equals(uni[j])){
                    find=true;
                    fre[j]++;
                    break;
                }
            }
            if(!find){
                fre[size]=1;
                uni[size]=words[i];
                size++;
            }
        }

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(fre[i]<fre[j] || (fre[i]==fre[j] && uni[i].compareTo(uni[j])>0)){
                    int t=fre[i];
                    fre[i]=fre[j];
                    fre[j]=t;

                    String s=uni[i];
                    uni[i]=uni[j];
                    uni[j]=s;
                }
            }
        }
        for(int i=0;i<k;i++) System.out.println(uni[i]);
    }
}
