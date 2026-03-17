/*5. You’re given an even number n. If n=4, you have to print the following pattern:

4444
4334
4334
4444

If n=6, then the pattern should be like this:
666666
655556
654456
654456
655556
666666*/

 class Pattern{
public static void main(String[] args){
  int n=6;
 
   for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
         
                System.out.print(n-find(i,j,n-i-1,n-j-1));
          
        }
      System.out.println();
     }
}
static int find(int i,int j,int k, int l){
   int n1=i<j?i:j;
   int n2=k<l?k:l;

   return n1>n2?n2:n1;
}
}
