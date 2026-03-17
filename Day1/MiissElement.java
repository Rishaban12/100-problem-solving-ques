public class MiissElement {
    public static void main(String[] args) {
        /*int[] arr1={10,20,30,12,5};
        int[] arr2={10,5,30,20};*/

        int[] arr1={-1,0,3,2};
        int[] arr2={3,4,0,-1,2};

        int n1=0;
        int n2=0;

        for(int k: arr1){
            n1+=k;
        }
        for(int k: arr2){
            n2+=k;
        }

        int diff=Math.abs(n1-n2);

       // int l=0,r=arr1.length-1;
        int ans=0;

        /*while(l<=r){
            int mid=l+(r-l)/2;

            if(arr1[mid]==diff){
                ans=mid;
                break;
            }else if(arr1[mid]<diff){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }*/

        if(arr1.length>arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]==diff){
                    ans=i;
                    break;
                }
            }
        }else{
            for(int i=0;i<arr2.length;i++){
                if(arr2[i]==diff){
                    ans=i;
                    break;
                }
            }
        }
        System.out.println(ans);
        System.out.println(diff);

    }

}
