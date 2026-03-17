/* 2. Write a program to print a Right-Angled Pascal’s Triangle pattern for a given number of rows N.

Example 1:
Input: N = 5
Output:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1 */

class TrianglePattern{
public static void main(String[] args){
    int n=5;
    int c=1;
   for(int i=1;i<=n;i++){
     System.out.println(c);
     c=c*11;   
} 
}
}
