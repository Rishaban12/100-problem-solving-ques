/* 1. Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1’s in the resulting array. Return 0 if
there is no such subarray.

Example 1:
Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1’s.

Example 2:
Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1’s is
[1,1,1,1,1].

Example 3:
Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element. */
class SubArray{
public static void main(String[] args){
  int[] arr={0,1,1,1,0,1,1,0,1};
  int count=0,pre=0,total=0;
  boolean flag=false;
  int max=0;
  for(int i=0;i<arr.length;i++){
       if(arr[i]==1){
         count++;
         }
       else{
         total=count+pre;
         max=Math.max(max,total);
         pre=count;
         count=0;
      }
       max=Math.max(max,pre+count);
      if(count==arr.length) {
         max--;  
        }
    }
   System.out.println(max);
  }
}

