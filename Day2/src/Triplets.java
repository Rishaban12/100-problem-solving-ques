import java.util.*;

public class Triplets {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        //int[] nums={0,1,1};

       /* for(int i=0;i<nums.length;i++){
            int n1=nums[i];
            for(int j=0;j<nums.length;j++) {
                if (i != j ) {
                    int n2 = nums[j];
                    for (int k = 0; k < nums.length; k++) {
                        if(i!=k && j!=k){
                            int total=n1+n2+nums[k];
                            if(total==0){
                                List<Integer> list=new ArrayList<>();
                                list.add(n1);
                                list.add(n2);
                                list.add(nums[k]);
                                Collections.sort(list);
                                set.add(list);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(set);*/
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            else {
                int l = i + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int n1 = nums[i];
                    int n2 = nums[l];
                    int n3 = nums[r];

                    if (n1 + n2 + n3 == 0) {
                        List<Integer> lr = new ArrayList<>();
                        lr.add(n1);
                        lr.add(n2);
                        lr.add(n3);
                        list.add(lr);
                        l++;
                        r--;

                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;

                    } else if (n1 + n2 + n3 < 0) {
                        l++;
                    } else if (n1 + n2 + n3 > 0) {
                        r--;
                    }
                }
            }
        }
        System.out.println(list);
    }
}



