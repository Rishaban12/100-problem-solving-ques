import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,5,5};
        int target=8;

        Arrays.sort(arr);
        long res=0;
        int mod=1000000007;

        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int k=arr.length-1;

            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];

                if(sum<target){
                    j++;
                }else if(sum>target){
                    k--;
                }else{
                    if(arr[j]==arr[k]){
                        int len=(k-j+1);
                        res+=(long)len*(len-1)/2;
                        res%=mod;
                        break;
                    }else{
                        int l=1;
                        int r=1;

                        while(j+1<k && arr[j]==arr[j+1]){
                            l++;
                            j++;
                        }
                        while(k-1>j && arr[k]==arr[k-1]){
                            r++;
                            k--;
                        }
                        res+=(long)(r*l);
                        res%=mod;

                        j++;
                        k--;
                    }
                }
            }
        }
        System.out.println((int)res);
    }
}
