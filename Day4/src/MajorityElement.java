import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,2};

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int n=arr.length/2;
        int ans=0;

        for(int key: map.keySet()){
            if(map.get(key)>n && map.get(key)>ans){
                ans=key;
            }
        }
        System.out.println(ans);
    }
}
