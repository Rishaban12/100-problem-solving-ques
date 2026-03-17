import java.util.Arrays;                                                                               
public class MeetingScheduler{
public static void main(String[] args){
 int[][] arr1={{1,3},{6,7}};
 int[][] arr2={{2,4},{7,9}};

int i=0,j=0,duration=1;

while(i<arr1.length && j<arr2.length){
   int f1=arr1[i][0];
   int f2=arr2[j][0];

   int s1=arr1[i][1];
   int s2=arr2[j][1];


   int n1=Math.max(f1,f2);
   int n2=Math.min(s1,s2);

   if(n2-n1 >= duration){
     System.out.println(Arrays.toString(new int[]{n1,n1+duration}));
    return;
        }else if(s1<s2){
         i++;
   }else{
     j++;
}
}
}
}






