/* 4. Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and
j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]] 

Example 2:
Input: nums = [0,1,1]
Output: []

Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]] */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class TripletSum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};

        Arrays.sort(arr);
        List<List<Integer>> l=new ArrayList<>();


        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=arr.length-1;

            while(j<k){
                int total=arr[i]+arr[j]+arr[k];
                if(total==0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    l.add(list);
                    j++;
                    k--;
                    while (j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }else if(total<0){
                    j++;
                }else if(total>0){
                    k--;
                }
            }
        }
        System.out.println(l);
    }
}

